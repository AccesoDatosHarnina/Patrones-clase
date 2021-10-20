package arma03;

public class Principal {
	public static void main(String[] args) {
		Nave miNave = new NaveBase();
		// Ponemos disparo
		miNave = new Disparo(miNave);
		System.out.println(miNave.dispara());
		System.out.println(miNave.getClass().toString());
		
		miNave=new Armadura(miNave);
		System.out.println(miNave.dispara());
		System.out.println(miNave.getClass().toString());
		System.out.println(miNave.ponerArmadura());
		miNave=new Armadura(miNave);
		System.out.println(miNave.dispara());
		System.out.println(miNave.getClass().toString());
		System.out.println(miNave.ponerArmadura());
		miNave = new Disparo(miNave);
		miNave = new Disparo(miNave);
		miNave = new Disparo(miNave);
		miNave = new Disparo(miNave);
		miNave = new Disparo(miNave);
		System.out.println(miNave.dispara());
		System.out.println(miNave.getClass().toString());
		System.out.println(miNave.ponerArmadura());
		//hasta aqui sin problemas
		miNave=miNave.quitarArmadura();
		System.out.println(miNave.getClass().toString());
		System.out.println(miNave.ponerArmadura());
	}
}
