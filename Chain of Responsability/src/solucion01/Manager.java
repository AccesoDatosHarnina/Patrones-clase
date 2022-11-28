package solucion01;

import java.util.ArrayList;

public class Manager {

	ArrayList<Handler> handlers;
	Handler initial;

	public Manager(ArrayList<Handler> handlers) {
		super();
		this.handlers = handlers;
		initial = handlers.get(0);
		for (int i = 0; i < this.handlers.size() - 1; i++) {
			this.handlers.get(i).setNext(this.handlers.get(i + 1));
		}
	}

	public void manage(ObjectOfManaging requestCDR) {
		this.initial.handle(requestCDR);
	}
}
