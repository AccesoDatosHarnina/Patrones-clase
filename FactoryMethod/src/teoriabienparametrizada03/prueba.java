package teoriabienparametrizada03;

public class prueba {
	public static void main(String args[]) {
		ProductManager productManager = new ProductManager();
		//Debo conocer los constructores de los creadores
		Product producto = productManager.createProduct(new ConcreteCreatorA(3));
		producto.operacion();
		System.out.println(producto.quienSoy());
		// este casteo lo hago para que se vea que funciona. no deberiamos tener acceso
		// a elementos propios casteando
		System.out.println(((ConcreteProduct) producto).getMipropiedad());
		producto = productManager.createProduct(new ConcreteCreatorB());
		producto.operacion();
		System.out.println(producto.quienSoy());
	}
}
