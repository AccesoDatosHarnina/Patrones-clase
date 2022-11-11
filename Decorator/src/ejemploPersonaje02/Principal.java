package ejemploPersonaje02;


public class Principal {
public static void main(String[] args) {
	Personaje aldeano=new Aldeano();
	System.out.println("Sin na "+aldeano.mostrarArmadura());
	aldeano=new Armadura(aldeano);
	System.out.println("con Armadura "+aldeano.mostrarArmadura()+" "+aldeano.mostrarFuerza());
	aldeano=new Armadura(aldeano);
	System.out.println("con Armadura "+aldeano.mostrarArmadura()+" "+aldeano.mostrarFuerza());
	aldeano=aldeano.decrementaElemento();
	System.out.println("Degrando una armadura "+aldeano.mostrarArmadura()+" "+aldeano.mostrarFuerza());
	aldeano=new Fuerza(aldeano);
	System.out.println("con Fuerza "+aldeano.mostrarArmadura()+" "+aldeano.mostrarFuerza());
	aldeano=new Fuerza(aldeano);
	aldeano=new Fuerza(aldeano);
	System.out.println("con Fuerza "+aldeano.mostrarArmadura()+" "+aldeano.mostrarFuerza());
	aldeano=aldeano.decrementaElemento();
	System.out.println("degrada fuerza "+aldeano.mostrarArmadura()+" "+aldeano.mostrarFuerza());
	
}
}
