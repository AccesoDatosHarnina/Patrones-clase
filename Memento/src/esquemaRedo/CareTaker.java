package esquemaRedo;

import java.util.LinkedList;

public class CareTaker<T extends Clonable<T>> {
	private Originator<T> originator;
	private LinkedList<Memento<T>> mementos = new LinkedList<>();
	private int index=-1;

	public CareTaker(Originator<T> originator) {
		super();
		this.originator = originator;
	}

	public void makeMemento() throws CloneNotSupportedException {
		Memento<T> save  = originator.save();
		//primero vamos a borrar toda la lista
		for (int i =mementos.size()-1 ; i >= index+1 ; i--) {
			mementos.remove(i);
		};
		mementos.addLast(save);
		index++;
	}
	
	public void undo() throws CloneNotSupportedException {
		if(index>0) {
			originator.setState(mementos.get(--index).getState().clonar());
		}
	}
	
	public void redo() throws CloneNotSupportedException {
		if(index<mementos.size()-1) {
			originator.setState(mementos.get(++index).getState().clonar());
		}
	}
}
