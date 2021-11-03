package esquema;

import java.util.ArrayList;

public class User {
	public static void main(String[] args) {
		MyCollection<String> coleccion=new MyCollection<>(new ArrayList<String>());
		coleccion.add("hola");
		coleccion.add(" que ");
		coleccion.add(" tal ");
		coleccion.add(" estas ");
		coleccion.add(" hoy?");
		Iterator<String> iterator = coleccion.createIterator();
		while(iterator.hasMore()) {
			System.out.println(iterator.getNext());
		}
	}
}
