package ejemplo03;

public class Cliente {

	public static void main(String[] args) {
		Persona persona=new Persona();
		Direccionador direccionador=new Direccionador();
		direccionador.addDireccion(new Adaptador().adapt(persona));
	}

}
