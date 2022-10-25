package ejemploordenador;


public class Principal {
public static void main(String[] args) {
	Ordenador presupuesto=new OrdenadorBase();
	presupuesto=new Procesador(presupuesto);
	presupuesto=new DiscoDuro(presupuesto);
	System.out.println(presupuesto.calculateCost());
	
}
}
