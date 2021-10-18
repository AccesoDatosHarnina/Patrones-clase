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
import java.awt.event.ActionEvent;

public class ÉjercicioAdapterOneSloucion extends JFrame {

	private JPanel contentPane;
	private ArrayList<Cliente> clientes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ÉjercicioAdapterOneSloucion frame = new ÉjercicioAdapterOneSloucion();
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
	public ÉjercicioAdapterOneSloucion() {
		clientes = new ArrayList<>();
		clientes.add(new Cliente("Luis", (byte) 22, new Cuenta("1")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		ArrayList<AdaptadorCliente> adaptadorClientes = new ArrayList<>();
		for (Cliente cliente : clientes) {
			adaptadorClientes.add(new AdaptadorCliente(cliente));
		}
		JList<String> list = new JList(adaptadorClientes.toArray());
		contentPane.add(list, BorderLayout.CENTER);
		JButton btnGo = new JButton("GO!");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnGo, BorderLayout.SOUTH);
	}

}
