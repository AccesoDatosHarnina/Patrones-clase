package ejemplo01;

public class Carta {
	Flyweight estilo;
	Valor valor;
	public Carta(Flyweight estilo, Valor valor) {
		super();
		this.estilo = estilo;
		this.valor = valor;
	}
	
}
