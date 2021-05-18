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
import javax.swing.JScrollPane;
import javax.swing.JComboBox;

public class OrderGui extends JFrame {

	private JPanel contentPane;
	private JTextField txtIndtastAntal;
	private JTextField txtIndtastSgeordEller;
	private JTextField txtNavnForEvent;
	private JTable table;
	private JTable table_1;
	private JTable findUdstyrTable;
	private JTable valgtUdstyrTable;

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
		lagerBtn.setBounds(338, 56, 145, 67);
		layeredPane.add(lagerBtn);
		
		JButton annullerBtn = new JButton("Annuller");
		annullerBtn.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		annullerBtn.setBounds(917, 654, 137, 67);
		layeredPane.add(annullerBtn);
		
		JButton accepterBtn = new JButton("Accepter");
		accepterBtn.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		accepterBtn.setBounds(1064, 654, 137, 67);
		layeredPane.add(accepterBtn);
		
		JButton tilfjBtn = new JButton("Tilføj");
		tilfjBtn.setBounds(239, 589, 90, 35);
		layeredPane.add(tilfjBtn);
		
		txtIndtastAntal = new JTextField();
		txtIndtastAntal.setText("Indtast antal");
		txtIndtastAntal.setBounds(27, 589, 302, 35);
		layeredPane.add(txtIndtastAntal);
		txtIndtastAntal.setColumns(10);
		
		txtIndtastSgeordEller = new JTextField();
		txtIndtastSgeordEller.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		txtIndtastSgeordEller.setText("Indtast søgeord eller ID");
		txtIndtastSgeordEller.setBounds(27, 323, 302, 40);
		layeredPane.add(txtIndtastSgeordEller);
		txtIndtastSgeordEller.setColumns(10);
		
		JButton aktiveOrdreBtn = new JButton("Aktive Ordre");
		aktiveOrdreBtn.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		aktiveOrdreBtn.setBounds(182, 56, 145, 67);
		layeredPane.add(aktiveOrdreBtn);
		
		JLabel lblDeadlight = new JLabel("DEADLIGHT");
		lblDeadlight.setFont(new Font("Sylfaen", Font.PLAIN, 52));
		lblDeadlight.setBounds(931, 56, 415, 67);
		layeredPane.add(lblDeadlight);
		
		JLabel lblLydisken = new JLabel("LYDIKSEN");
		lblLydisken.setFont(new Font("Sylfaen", Font.BOLD, 60));
		lblLydisken.setBounds(931, 82, 312, 104);
		layeredPane.add(lblLydisken);
		
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
		
		findUdstyrTable = new JTable();
		findUdstyrTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"Udstyr", "Tilg\u00E6ngelige"},
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
		findUdstyrTable.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		findUdstyrTable.setBounds(27, 390, 302, 192);
		layeredPane.add(findUdstyrTable);
		
		valgtUdstyrTable = new JTable();
		valgtUdstyrTable.setModel(new DefaultTableModel(
			new Object[][] {
				{"Udstyr", "Valgt antal"},
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
				"Udstyr", "Valgt antal"
			}
		));
		valgtUdstyrTable.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		valgtUdstyrTable.setBounds(794, 390, 302, 192);
		layeredPane.add(valgtUdstyrTable);
		
		JLabel lblValgtUdstyr = new JLabel("Valgt udstyr");
		lblValgtUdstyr.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblValgtUdstyr.setBounds(794, 350, 260, 35);
		layeredPane.add(lblValgtUdstyr);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(298, 340, 174, -98);
		layeredPane.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(533, 337, -74, -31);
		layeredPane.add(scrollPane_1);
		
		JComboBox comboBoxSkabeloner = new JComboBox();
		comboBoxSkabeloner.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		comboBoxSkabeloner.setBounds(27, 183, 302, 40);
		layeredPane.add(comboBoxSkabeloner);
	}
}
