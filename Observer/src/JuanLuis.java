import java.util.Observable;
import java.util.Observer;

public class JuanLuis implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("soy juan luis y me han avisado de algo"+o.toString()+" "+arg.toString());

	}

}
