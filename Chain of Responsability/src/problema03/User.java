package problema03;

public class User {
	public static void main(String[] args) {

		Coche coche = new Coche();
		Manager client = new Manager();
		client.manage(coche);
	}

}
