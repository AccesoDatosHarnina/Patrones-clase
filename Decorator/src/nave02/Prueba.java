package nave02;

public class Prueba {

	public static void main(String[] args) {
		Nave nave=new NaveBase();
		//empieza a recolectar mas armadura
		nave=new Armadura(nave);
		nave=new Armadura(nave);
		nave=new Armadura(nave);
		nave=new Armadura(nave);
		nave=new Armadura(nave);
		System.out.println(nave.ponerArmadura());
		nave=nave.quitarArmadura();
		System.out.println(nave.ponerArmadura());
		nave=new DisparoLateral(nave);
		System.out.println(nave.ponerArmadura());
		//choco y le quiero quitear una armadura
		nave=nave.quitarArmadura();
		System.out.println(nave.ponerArmadura());
	}

}
