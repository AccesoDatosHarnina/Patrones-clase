import java.util.Observable;

public class Principal {
	public static void main(String[] args) throws InterruptedException {
		Avisador avisador = new Avisador();
//		Observable yObservable=new Observable();
		//No puede hacerse porque es protected, por eso siempre debemos heredar
//		yObservable.setChanged();
		JuanLuis juanLuis = new JuanLuis();
		JuanLuis juanLuisD = new JuanLuis();
		avisador.addObserver(juanLuis);
		avisador.addObserver(juanLuisD);
		System.out.println(avisador.countObservers());
		// Va a pasar algo
		do {
			avisador.engordaCantidad();
			Thread.sleep(5);
			System.out.println(avisador.cantidad);
		}while(true);
	
	}
}
