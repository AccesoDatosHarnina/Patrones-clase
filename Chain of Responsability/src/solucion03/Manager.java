package solucion03;

import java.util.ArrayList;

import solucion03.Handler;

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

	public void manage(Coche coche) {
		this.initial.handle(coche);
	}
}
