package esquema;

import java.time.LocalDate;
import java.time.Month;

public class Client {
public static void main(String[] args) throws CloneNotSupportedException {
	State state=new State(1, "tu",new SubState(LocalDate.of(1997, Month.APRIL, 23),"fdn"));
	
	Originator<State> originator=new Originator<State>(state);
	CareTaker<State> careTaker=new CareTaker<>(originator);
	careTaker.makeMemento();
	originator.state.setId(2);
	originator.state.setDatos("tu");
	careTaker.makeMemento();
	originator.state.setId(3);
	originator.state.getSubState().setLocalDate(LocalDate.of(2004, Month.APRIL, 11));
	originator.state.getSubState().setName("otro nombre");
	originator.state.setDatos("el");
	careTaker.makeMemento();
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
