package esquema;

public class UserTwo {
public static void main(String[] args) {
	Component component=new ConcreteComponent();
	component.execute();
	component=new ConcreteDecorator(component);
	component.execute();
	component=new ConcreteDecoratorB(component);
	component.execute();
}
}
