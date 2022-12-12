package ejemplo01;

public class Cliente {
	public static void main(String[] args) {
		int numeracion = 10;
		int palos = 4;
		FlyWeightFactory flyWeightFactory=new FlyWeightFactory();
		Carta[] baraja=new Carta[40];
		int index=0;
		for (int j = 0; j < palos + 1; j++) {
			for (int i = 1; i <= numeracion; i++) {
				//problema porque usamos un objeto para cada carta cuando es comun
				baraja[index++]=new Carta(flyWeightFactory.getFlyweight(new Estilo(3, "un forto muy grande con muchos colores y formas")), new Valor(i,j+1));
			}
		}
	}
	//problema
//	public static void main(String[] args) {
//		int numeracion = 10;
//		int palos = 4;
//		Carta[] baraja=new Carta[40];
//		int index=0;
//		for (int j = 0; j < palos + 1; j++) {
//			for (int i = 1; i <= numeracion; i++) {
//				//problema porque usamos un objeto para cada carta cuando es comun
//				baraja[index++]=new Carta(new Estilo(3, "un forto muy grande con muchos colores y formas"), new Valor(i,j+1));
//			}
//		}
//	}
}
