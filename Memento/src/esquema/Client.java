package esquema;

public class Client {
public static void main(String[] args) {
	State state=new State(1, "tu");
	
	Originator<State> originator=new Originator<State>(new State(1, "yo"));
	CareTaker<State> careTaker=new CareTaker<>(originator);
	careTaker.doSomething();
	originator.state.setId(2);
	originator.state.setDatos("tu");
	careTaker.doSomething();
	originator.state.setId(3);
	originator.state.setDatos("el");
	careTaker.doSomething();
	originator.state.setId(4);
	originator.state.setDatos("vosotros");
	System.out.println(originator.state.toString());
	careTaker.undo();
	System.out.println(originator.state.toString());
	careTaker.undo();
	System.out.println(originator.state.toString());
	careTaker.undo();
	System.out.println(originator.state.toString());
	
	
}
}
