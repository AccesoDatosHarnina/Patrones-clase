package teoria;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class cosas extends JFrame {

	private JPanel contentPane;
	AbstactFactory abstactFactory;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cosas frame = new cosas();
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
	public cosas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 572, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(82, 52, 276, 24);
		contentPane.add(comboBox);
		comboBox.addItem(new ConcreteFactoryOne());
		comboBox.addItem(new ConcreteFactoryTwo());
		
		textField = new JTextField();
		textField.setBounds(69, 126, 264, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				abstactFactory=(AbstactFactory) comboBox.getSelectedItem();
				textField.setText(abstactFactory.getProductA().dime());
			}
		});
	}
}
