package ejemplo01;
import java.util.Observable;
import java.util.Observer;

public class Observador implements Observer {

	private String name;
	
	public Observador(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("soy "+name+" y me han avisado de algo"+o.toString()+" "+arg.toString());
	}
	

}
