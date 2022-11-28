package ejemplo01;

import java.util.Iterator;
import java.util.LinkedList;

public class Principal {
public static void main(String[] args) {
	LinkedList<String> lista=new LinkedList<>();
	Iterator<String> iterator = lista.iterator();
	while (iterator.hasNext()) {
		String string = (String) iterator.next();
		
	}
}
}
