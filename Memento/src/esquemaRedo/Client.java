package esquemaRedo;

import java.time.LocalDate;
import java.time.Month;

public class Client {
public static void main(String[] args) throws CloneNotSupportedException {
	State state=new State(1, "tu",new SubState(LocalDate.of(1997, Month.APRIL, 23),"fdn"));
	
	Originator<State> originator=new Originator<State>(state);
	CareTaker<State> careTaker=new CareTaker<>(originator);
	careTaker.makeMemento();
	originator.getState().setId(2);
	originator.getState().setDatos("tu");
	careTaker.makeMemento();
	originator.getState().setId(3);
	originator.getState().getSubState().setLocalDate(LocalDate.of(2004, Month.APRIL, 11));
	originator.getState().getSubState().setName("otro nombre");
	originator.getState().setDatos("el");
	careTaker.makeMemento();
	originator.getState().setId(4);
	originator.getState().setDatos("vosotros");
	careTaker.makeMemento();
	System.out.println(originator.getState().toString());
	careTaker.undo();
	System.out.println(originator.getState().toString());
	careTaker.undo();
	System.out.println(originator.getState().toString());
	careTaker.undo();
	System.out.println(originator.getState().toString());
	careTaker.undo();
	System.out.println(originator.getState().toString());
	careTaker.redo();
	System.out.println(originator.getState().toString());
	careTaker.redo();
	System.out.println(originator.getState().toString());
	careTaker.redo();
	System.out.println(originator.getState().toString());
	careTaker.redo();
	System.out.println(originator.getState().toString());
	
	
	
}
}
