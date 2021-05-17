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
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OrderGui extends JFrame {

	private JPanel contentPane;
	private JTextField txtIndtastAntal;
	private JTextField txtIndtastSgeordEller;
	private JTextField txtNavnForEvent;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

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
		eventBtn.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		eventBtn.setBounds(494, 56, 145, 67);
		layeredPane.add(eventBtn);
		
		JButton opretOrdreBtn = new JButton("Opret Ordre");
		opretOrdreBtn.setFont(new Font("Sylfaen", Font.BOLD, 20));
		opretOrdreBtn.setBounds(27, 56, 145, 67);
		layeredPane.add(opretOrdreBtn);
		
		JButton lagerBtn = new JButton("Lager");
		lagerBtn.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		lagerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lagerBtn.setBounds(339, 56, 145, 67);
		layeredPane.add(lagerBtn);
		
		JButton annullerBtn = new JButton("Annuller");
		annullerBtn.setBounds(917, 654, 137, 67);
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
		txtIndtastSgeordEller.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		txtIndtastSgeordEller.setText("Indtast søgeord eller ID");
		txtIndtastSgeordEller.setBounds(27, 267, 201, 40);
		layeredPane.add(txtIndtastSgeordEller);
		txtIndtastSgeordEller.setColumns(10);
		
		JButton aktiveOrdreBtn = new JButton("Aktive Ordre");
		aktiveOrdreBtn.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		aktiveOrdreBtn.setBounds(182, 56, 147, 67);
		layeredPane.add(aktiveOrdreBtn);
		
		JLabel lblNewLabel = new JLabel("DEADLIGHT");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 52));
		lblNewLabel.setBounds(931, 56, 415, 67);
		layeredPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LYDIKSEN");
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD, 60));
		lblNewLabel_1.setBounds(931, 82, 312, 104);
		layeredPane.add(lblNewLabel_1);
		
		txtNavnForEvent = new JTextField();
		txtNavnForEvent.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		txtNavnForEvent.setText("Navn for event");
		txtNavnForEvent.setBounds(27, 133, 302, 40);
		layeredPane.add(txtNavnForEvent);
		txtNavnForEvent.setColumns(10);
		
		table = new JTable();
		table.setBounds(44, 334, 1, 1);
		layeredPane.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(27, 514, 244, -164);
		layeredPane.add(table_1);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Udstyr", "Tilg\u00E6ngelige"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_2.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		table_2.setBounds(27, 334, 234, 192);
		layeredPane.add(table_2);
	}
}
