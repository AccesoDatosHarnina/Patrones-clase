package ejemplo;

public class Cliente {
	Abstraccion mia=new Abstraccion(new HornoGas());
	public static void main(String[] args) {
		Cliente cliente=new Cliente();		
		cliente.mia.cocinarConVentilador();
	}
}
