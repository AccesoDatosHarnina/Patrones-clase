package solucion01;

import java.util.ArrayList;

public class Client {

	ArrayList<Handler> handlers;
	Handler initial;

	public Client(ArrayList<Handler> handlers) {
		super();
		this.handlers = handlers;
		initial = handlers.get(0);
		for (int i = 0; i < handlers.size() - 1; i++) {
			handlers.get(i).setNext(handlers.get(i + 1));
		}
	}

	public void manage(ObjectOfManaging requestCDR) {
		initial.handle(requestCDR);
	}
}
