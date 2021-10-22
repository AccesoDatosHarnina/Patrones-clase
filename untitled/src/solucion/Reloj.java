package solucion;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Reloj extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Incrementador incrementador = new Incrementador();
					Reloj frame = new Reloj(incrementador);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param incrementador 
	 */
	public Reloj(Incrementador incrementador) {
		incrementador.start();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JSlider slider = new JSlider();
		slider.setValue(0);
		contentPane.add(slider, BorderLayout.CENTER);

		JButton btnGo = new JButton("go");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//hay un hilo principal que depende de una cola. Mientras el otro hilo
				//esta ejecutandose el principal, el grafico, espera a que este acabe
				//al crear un hilo indepndientes este ya no debe esperar
				new Thread() {
					@Override
					public void run() {
						super.run();
						do {
							System.out.println();
							slider.setValue(incrementador.getValue());
						} while (slider.getValue() < 99);
					}
				}.start();
				
			}
		});
		contentPane.add(btnGo, BorderLayout.SOUTH);
	}

}
