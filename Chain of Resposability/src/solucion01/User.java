package solucion01;

import java.util.ArrayList;

public class User {
public static void main(String[] args) {
	ArrayList<Handler> handlers=new ArrayList<>();
	handlers.add(new Solution());
	handlers.add(new Inhibition());
	handlers.add(new Exclusion());
	Client client=new Client(handlers);
	client.manage(new ObjectOfManaging(1));
	client.manage(new ObjectOfManaging(2));
	client.manage(new ObjectOfManaging(3));
}
}
