package ejemploSeres.solucion;

public class Utiles {
	

	
	public  static int dameNumero(int limite) {
		return (int) (Math.random() * (limite));
	}

	
	public static int[] damePosicionAlrededor(int lugar) {
		int[][] posicion = { { -1, -1 }, { -1, 0 }, { -1, +1 },
				{ 0, -1 }, { 0, +1 }, { +1, -1 }, { +1, 0 },
				{ +1, +1 } };
		return posicion[lugar];
	}
	
	
	
	
	
	
	
	
	
	
}
