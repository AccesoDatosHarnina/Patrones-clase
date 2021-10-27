package esquema;

import java.util.ArrayList;

public class User {
public static void main(String[] args) {
	ArrayList<Handler> handlers=new ArrayList<>();
	handlers.add(new ConcreteA());
	handlers.add(new ConcreteB());
	Client client=new Client(handlers);
	client.manage(new RequestCDR(1));
	client.manage(new RequestCDR(2));
	client.manage(new RequestCDR(3));
}
}
