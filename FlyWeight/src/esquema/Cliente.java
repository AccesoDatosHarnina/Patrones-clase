package esquema;

public class Cliente {
public static void main(String[] args) {
	FlyWeightFactory factoria=new FlyWeightFactory();
	int estadoComun=878;
	Context ejemplar=new Context(12, estadoComun,factoria);
}
}
