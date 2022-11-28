package problema01;

public class User {
public static void main(String[] args) {
	Manager manager=new Manager();
	manager.managingThis(new ObjectOfManaging(), 1);
	manager.managingThis(new ObjectOfManaging(), 2);
	manager.managingThis(new ObjectOfManaging(), 3);
}
}
