package problema03;

public class Coche {
	private boolean pulido;
	private boolean imprimado;
	private boolean pintado;
	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean isPulido() {
		return pulido;
	}
	public void setPulido(boolean pulido) {
		this.pulido = pulido;
	}
	public boolean isImprimado() {
		return imprimado;
	}
	public void setImprimado(boolean imprimado) {
		this.imprimado = imprimado;
	}
	public boolean isPintado() {
		return pintado;
	}
	public void setPintado(boolean pintado) {
		this.pintado = pintado;
	}
	
	public String getEstado() {
		return "el coche esta: pulido "+isPulido()+" imprimado "+isImprimado()+" pintado "+isPintado();
	}
	
}
