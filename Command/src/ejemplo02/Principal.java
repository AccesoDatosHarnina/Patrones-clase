package ejemplo02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class Principal {
public static void main(String[] args) {
	JTextField sd=new JTextField();
	sd.addActionListener(new ActionListener() {
		
		//esto es un command
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
}
}
