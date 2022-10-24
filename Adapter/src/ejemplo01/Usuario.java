package ejemplo01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Usuario {

	public static void main(String[] args) {
		PersonaV2 personaV2=new PersonaV2(new NombreCompleto("luis", "nono"), (byte) 1);
//		ClienteNoAdapter clienteNoAdapter=new ClienteNoAdapter(personaV1);
//		clienteNoAdapter.hazAlgo();
		MouseListener nn=new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
			}
		};
		ClienteSiAdapter clienteSiAdapter=new ClienteSiAdapter(new Adaptador(personaV2));
		clienteSiAdapter.hazAlgo();
	}

}
