package solucion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClientTest {

	
	@Test
	void test() {
		TreeNumberLeaf leaf=new TreeNumberLeaf(2);
		TreeNumberLeaf leaf1=new TreeNumberLeaf(3);
		TreeNumberComposite composite1=new TreeNumberComposite("sub11");
		composite1.add(leaf);
		composite1.add(leaf1);
		TreeNumberLeaf leaf2=new TreeNumberLeaf(-5);
		TreeNumberLeaf leaf3=new TreeNumberLeaf(6);
		TreeNumberComposite composite2=new TreeNumberComposite("sub12");
		composite2.add(leaf2);
		composite2.add(leaf3);
		TreeNumberComposite composite3=new TreeNumberComposite("sub1");
		composite3.add(composite1);
		composite3.add(composite2);
		composite3.add(new TreeNumberLeaf(4));
		TreeNumberLeaf leaf4=new TreeNumberLeaf(1);
		TreeNumberLeaf leaf5=new TreeNumberLeaf(7);		
		TreeNumberComposite raiz = new TreeNumberComposite("raiz");
		raiz.add(leaf4);
		raiz.add(leaf5);
		raiz.add(composite3);
		Client client=new Client(raiz);
		System.out.println(client.getRaiz().sum());
	}

}
