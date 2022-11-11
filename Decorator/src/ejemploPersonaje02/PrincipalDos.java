package ejemploPersonaje02;

public class PrincipalDos {

	public static void main(String[] args) {
		Personaje aldeano=new Aldeano();
		aldeano=new Fuerza(aldeano);
		aldeano=new Armadura(aldeano);
		aldeano=new Armadura(aldeano);
		aldeano=new Armadura(aldeano);
		aldeano=new Armadura(aldeano);
		aldeano=new Fuerza(aldeano);
		aldeano=new Fuerza(aldeano);
		aldeano=new Fuerza(aldeano);
		aldeano=new Fuerza(aldeano);
		System.out.println(aldeano.mostrarArmadura());
		System.out.println(aldeano.mostrarFuerza());
		aldeano=aldeano.degradaTotal();
		System.out.println(aldeano.getClass());
		System.out.println(aldeano.mostrarArmadura());
		System.out.println(aldeano.mostrarFuerza());
	}

}
