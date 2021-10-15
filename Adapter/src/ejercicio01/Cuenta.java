package ejercicio01;

public class Cuenta {
	private String numero;
	private float saldo;
	public Cuenta(String numero) {
		super();
		this.numero = numero;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	@Override
	public String toString() {
		return super.toString()+numero;
	}
}
