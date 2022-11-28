package solucion03;

import java.util.ArrayList;

public class Cliente {
public static void main(String[] args) {
	ArrayList<Handler> handlers=new ArrayList<Handler>();
	handlers.add(new Pulidora());
	handlers.add(new Imprimadora());
	handlers.add(new Pintor());
	Coche coche=new Coche();
	Manager manager=new Manager(handlers);
	manager.manage(coche);
}
}
