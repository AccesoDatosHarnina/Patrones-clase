package ejercicio01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.awt.event.ActionEvent;

public class EjercicioAdapterOne extends JFrame {
	private ArrayList<Persona> clientes;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjercicioAdapterOne frame = new EjercicioAdapterOne();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EjercicioAdapterOne() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		clientes = new ArrayList<Persona>();
		clientes.add(new Persona("Luis", (byte) 22, new Cuenta("1")));
		clientes.add(new Persona("Fernando", (byte) 22, new Cuenta("2")));
		clientes.add(new Persona("Enriques", (byte) 22, new Cuenta("3")));
		JList<String> list = new JList(
				clientes.stream()
				.map(
						(cliente) 
						-> new AdaptadorPersona(cliente).toString()
						)
				.collect(Collectors.toList()).toArray()
				);
		contentPane.add(list, BorderLayout.CENTER);
		JButton btnGo = new JButton("GO!");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnGo, BorderLayout.SOUTH);
	}

}
