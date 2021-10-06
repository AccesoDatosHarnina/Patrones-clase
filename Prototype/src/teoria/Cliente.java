package teoria;

public class Cliente {

	
	public void useClon(Prototype prototype) {
		Prototype copia=prototype.clonar();
		System.out.println("antes de modificar ");
		copia.present();
		//Esto es una trampa para explicar porque no deberia hacer downcast
		((ConcretePrototypeOneSub)copia).fieldTwo=4;
		System.out.println("despues de modificar ");
		copia.present();
		System.out.println("el original despues de modificar");
		prototype.present();
	}
}
