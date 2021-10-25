package ejercicio01Solucion;

//Pedir un ejemplo con cartas
public class PelotaConcreta {
	private int x=0, y=0;
	private PelotaFlyweight pelotaFlyweight;

	public PelotaConcreta(PelotaFlyweight pelotaFlyweight) {
		super();
		this.pelotaFlyweight = pelotaFlyweight;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getPeso() {
		return pelotaFlyweight.getPeso();
	}

	public String getColor() {
		return pelotaFlyweight.getColor();
	};

}
