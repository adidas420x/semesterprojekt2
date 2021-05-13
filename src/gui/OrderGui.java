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
import javax.swing.JList;

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
		
		JButton eventBtn = new JButton("Events");
		eventBtn.setBounds(494, 56, 145, 67);
		layeredPane.add(eventBtn);
		
		JButton opretOrdreBtn = new JButton("Opret Ordre");
		opretOrdreBtn.setBounds(27, 56, 145, 67);
		layeredPane.add(opretOrdreBtn);
		
		JButton lagerBtn = new JButton("Lager");
		lagerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lagerBtn.setBounds(339, 56, 145, 67);
		layeredPane.add(lagerBtn);
		
		JLabel eventNavnLbl = new JLabel("                                     Navn for event");
		eventNavnLbl.setBounds(27, 133, 302, 40);
		layeredPane.add(eventNavnLbl);
		
		JButton annullerBtn = new JButton("Annuller");
		annullerBtn.setBounds(896, 654, 137, 67);
		layeredPane.add(annullerBtn);
		
		JButton accepterBtn = new JButton("Accepter");
		accepterBtn.setBounds(1064, 654, 137, 67);
		layeredPane.add(accepterBtn);
		
		JButton tilfjBtn = new JButton("Tilføj");
		tilfjBtn.setBounds(226, 746, 90, 35);
		layeredPane.add(tilfjBtn);
		
		txtIndtastAntal = new JTextField();
		txtIndtastAntal.setText("Indtast antal");
		txtIndtastAntal.setBounds(27, 746, 201, 35);
		layeredPane.add(txtIndtastAntal);
		txtIndtastAntal.setColumns(10);
		
		txtIndtastSgeordEller = new JTextField();
		txtIndtastSgeordEller.setText("Indtast søgeord eller ID");
		txtIndtastSgeordEller.setBounds(27, 268, 201, 20);
		layeredPane.add(txtIndtastSgeordEller);
		txtIndtastSgeordEller.setColumns(10);
		
		JButton aktiveOrdreBtn = new JButton("Aktive Ordre");
		aktiveOrdreBtn.setBounds(182, 56, 147, 67);
		layeredPane.add(aktiveOrdreBtn);
	}
}
