package ejercicio01naveespacial;

public class Prueba {

	public static void main(String[] args) {
		Nave nave=new NaveBase();
		System.out.println(nave.dispara());
		//consigue una estrella azul
		nave=new DisparoLateral(nave);
		System.out.println(nave.dispara());
		//bola roja
		nave=new DisparoSuper(nave);
		System.out.println(nave.dispara());
		// enemigo nos alcance y perdemos el disparo superior

	}

}
