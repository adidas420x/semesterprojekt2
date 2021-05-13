package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class OrderGui extends JFrame {

	private JPanel contentPane;
	private JTextField txtIndtastAntal;
	private JTextField txtIndtastSgeordEller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderGui frame = new OrderGui();
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
	public OrderGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("Events");
		btnNewButton.setBounds(1458, 98, 89, 23);
		layeredPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Opret Ordre");
		btnNewButton_1.setBounds(1363, 98, 89, 23);
		layeredPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Lager");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(1268, 98, 89, 23);
		layeredPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Eventnavn");
		lblNewLabel.setBounds(250, 161, 115, 14);
		layeredPane.add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton("Annuller");
		btnNewButton_3.setBounds(614, 443, 89, 23);
		layeredPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Accepter");
		btnNewButton_4.setBounds(749, 443, 89, 23);
		layeredPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Tilføj");
		btnNewButton_5.setBounds(488, 648, 89, 23);
		layeredPane.add(btnNewButton_5);
		
		txtIndtastAntal = new JTextField();
		txtIndtastAntal.setText("Indtast antal");
		txtIndtastAntal.setBounds(207, 618, 86, 20);
		layeredPane.add(txtIndtastAntal);
		txtIndtastAntal.setColumns(10);
		
		txtIndtastSgeordEller = new JTextField();
		txtIndtastSgeordEller.setText("Indtast søgeord eller ID");
		txtIndtastSgeordEller.setBounds(186, 380, 201, 20);
		layeredPane.add(txtIndtastSgeordEller);
		txtIndtastSgeordEller.setColumns(10);
	}
}
