package lambda035;

public enum ppp {
	primero(1,()->{return 1;}),segundo(2),tercero(3);
	
	private int valor;
	private FuncionalPrueba funcionalPrueba;
	

	

	private ppp(int valor, FuncionalPrueba funcionalPrueba) {
		this.valor = valor;
		this.funcionalPrueba = funcionalPrueba;
	}




	public int getValor() {
		return valor;
	}
	
	
}
