package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.Color;

public class OrderGui extends JFrame {

	private JPanel contentPane;
	private JTextField txtIndtastAntal;
	private JTextField txtIndtastSgeord;
	private JTextField txtNavnForEvent;
	private JTable findUdstyrTable;
	private JTable valgtUdstyrTable;
	private JTextField txtEventStartDate;
	private JTextField txtEventEndDate;
	private JTextField txtIndtastID;
	
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
		layeredPane.setForeground(new Color(0, 0, 128));
		layeredPane.setBackground(new Color(0, 0, 128));
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JButton idSgBtn = new JButton("Søg");
		idSgBtn.setBackground(new Color(100, 149, 237));
		idSgBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		idSgBtn.setBounds(393, 370, 90, 40);
		layeredPane.add(idSgBtn);
		
		JButton navnSgBtn = new JButton("Søg");
		navnSgBtn.setBackground(new Color(100, 149, 237));
		navnSgBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		navnSgBtn.setBounds(393, 315, 90, 40);
		layeredPane.add(navnSgBtn);
		
		JButton eventBtn = new JButton("Events");
		eventBtn.setBackground(new Color(0, 0, 139));
		eventBtn.setForeground(new Color(255, 255, 255));
		eventBtn.setFont(new Font("Sylfaen", Font.BOLD, 18));
		eventBtn.setBounds(494, 56, 145, 67);
		layeredPane.add(eventBtn);
		
		JButton opretOrdreBtn = new JButton("Opret ordre");
		opretOrdreBtn.setBackground(new Color(0, 0, 139));
		opretOrdreBtn.setForeground(new Color(135, 206, 250));
		opretOrdreBtn.setFont(new Font("Sylfaen", Font.BOLD, 18));
		opretOrdreBtn.setBounds(27, 56, 145, 67);
		layeredPane.add(opretOrdreBtn);
		
		JButton lagerBtn = new JButton("Lager");
		lagerBtn.setBackground(new Color(0, 0, 139));
		lagerBtn.setForeground(new Color(255, 255, 255));
		lagerBtn.setFont(new Font("Sylfaen", Font.BOLD, 18));
		lagerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lagerBtn.setBounds(338, 56, 145, 67);
		layeredPane.add(lagerBtn);
		
		JButton annullerBtn = new JButton("Annuller ordre");
		annullerBtn.setBackground(new Color(255, 69, 0));
		annullerBtn.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		annullerBtn.setBounds(909, 654, 145, 67);
		layeredPane.add(annullerBtn);
		
		JButton opretBtn = new JButton("Opret ordre");
		opretBtn.setBackground(new Color(50, 205, 50));
		opretBtn.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		opretBtn.setBounds(1064, 654, 145, 67);
		layeredPane.add(opretBtn);
		
		JButton tilfjBtn = new JButton("Tilføj");
		tilfjBtn.setBackground(new Color(100, 149, 237));
		tilfjBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tilfjBtn.setBounds(393, 650, 90, 40);
		layeredPane.add(tilfjBtn);
		
		txtIndtastAntal = new JTextField();
		txtIndtastAntal.setBackground(new Color(135, 206, 250));
		txtIndtastAntal.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		txtIndtastAntal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtIndtastAntal.setText("");
			}
		});
		txtIndtastAntal.setText("Indtast antal");
		txtIndtastAntal.setBounds(27, 650, 366, 40);
		layeredPane.add(txtIndtastAntal);
		txtIndtastAntal.setColumns(10);
		
		txtIndtastSgeord = new JTextField();
		txtIndtastSgeord.setBackground(new Color(135, 206, 250));
		txtIndtastSgeord.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		txtIndtastSgeord.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtIndtastSgeord.setText("");
			}
		});
		txtIndtastSgeord.setText("Indtast søgeord");
		txtIndtastSgeord.setBounds(27, 315, 366, 40);
		layeredPane.add(txtIndtastSgeord);
		txtIndtastSgeord.setColumns(10);
		
		JButton aktiveOrdreBtn = new JButton("Aktive ordre");
		aktiveOrdreBtn.setBackground(new Color(0, 0, 139));
		aktiveOrdreBtn.setForeground(new Color(255, 255, 255));
		aktiveOrdreBtn.setFont(new Font("Sylfaen", Font.BOLD, 18));
		aktiveOrdreBtn.setBounds(182, 56, 145, 67);
		layeredPane.add(aktiveOrdreBtn);
		
		JLabel lblDeadlight = new JLabel("DEADLIGHT");
		lblDeadlight.setForeground(new Color(255, 255, 255));
		lblDeadlight.setFont(new Font("Sylfaen", Font.PLAIN, 52));
		lblDeadlight.setBounds(931, 56, 415, 67);
		layeredPane.add(lblDeadlight);
		
		JLabel lblLydisken = new JLabel("LYDIKSEN");
		lblLydisken.setFont(new Font("Sylfaen", Font.BOLD, 60));
		lblLydisken.setBounds(931, 82, 312, 104);
		layeredPane.add(lblLydisken);
		
		txtNavnForEvent = new JTextField();
		txtNavnForEvent.setBackground(new Color(135, 206, 250));
		txtNavnForEvent.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		txtNavnForEvent.setText("Navn for event:");
		txtNavnForEvent.setBounds(27, 133, 456, 40);
		layeredPane.add(txtNavnForEvent);
		txtNavnForEvent.setColumns(10);
		txtNavnForEvent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNavnForEvent.setText("");
			}
		});
		
		JScrollPane scrollPaneFindUdstyr = new JScrollPane();
		scrollPaneFindUdstyr.setBounds(27, 430, 456, 215);
		layeredPane.add(scrollPaneFindUdstyr);
		
		findUdstyrTable = new JTable();
		scrollPaneFindUdstyr.setViewportView(findUdstyrTable);
		findUdstyrTable.setFillsViewportHeight(true);
		findUdstyrTable.setModel(new DefaultTableModel(
			new Object[][] {
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
		
			
		JComboBox<String> comboBoxSkabeloner = new JComboBox<String>();
		comboBoxSkabeloner.setBackground(new Color(135, 206, 250));
		comboBoxSkabeloner.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		comboBoxSkabeloner.setBounds(27, 183, 366, 40);
		layeredPane.add(comboBoxSkabeloner);
		
		comboBoxSkabeloner.setEditable(true);
		comboBoxSkabeloner.addItem("Nibe 2019");
		comboBoxSkabeloner.addItem("Samsung livestream event 2020");
		comboBoxSkabeloner.addItem("2 vogne, 4 ekstra kamera");
		comboBoxSkabeloner.addItem("1 vogn, 2 ekstra kamera");
		
		comboBoxSkabeloner.setSelectedItem("Skabeloner");
		
		txtEventStartDate = new JTextField();
		txtEventStartDate.setBackground(new Color(135, 206, 250));
		txtEventStartDate.setText("dd-mm-yyyy");
		txtEventStartDate.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		txtEventStartDate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEventStartDate.setText("");
			}
		});
		txtEventStartDate.setColumns(10);
		txtEventStartDate.setBounds(27, 233, 200, 40);
		layeredPane.add(txtEventStartDate);
		
		txtEventEndDate = new JTextField();
		txtEventEndDate.setBackground(new Color(135, 206, 250));
		txtEventEndDate.setText("dd-mm-yyyy");
		txtEventEndDate.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		txtEventEndDate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEventEndDate.setText("");
			}
		});
		txtEventEndDate.setColumns(10);
		txtEventEndDate.setBounds(283, 233, 200, 40);
		layeredPane.add(txtEventEndDate);
		
		JLabel lblNewLabel = new JLabel("-");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblNewLabel.setBounds(248, 242, 15, 13);
		layeredPane.add(lblNewLabel);
		
		JScrollPane scrollPaneValgtUdstyr = new JScrollPane();
		scrollPaneValgtUdstyr.setBounds(753, 315, 456, 330);
		layeredPane.add(scrollPaneValgtUdstyr);
		
		valgtUdstyrTable = new JTable();
		valgtUdstyrTable.setFillsViewportHeight(true);
		scrollPaneValgtUdstyr.setViewportView(valgtUdstyrTable);
		valgtUdstyrTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Udstyr", "Valgt antal"
			}
		));
		valgtUdstyrTable.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		
		txtIndtastID = new JTextField();
		txtIndtastID.setBackground(new Color(135, 206, 250));
		txtIndtastID.setText("Indtast ID");
		txtIndtastID.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		txtIndtastID.setColumns(10);
		txtIndtastID.setBounds(27, 370, 366, 40);
		layeredPane.add(txtIndtastID);
		
		JButton skabelonVlgBtn = new JButton("Vælg");
		skabelonVlgBtn.setBackground(new Color(100, 149, 237));
		skabelonVlgBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		skabelonVlgBtn.setBounds(393, 183, 90, 40);
		layeredPane.add(skabelonVlgBtn);
		
		JButton opretOgGemBtn = new JButton("Opret ordre & gem som skabelon");
		opretOgGemBtn.setBackground(new Color(100, 149, 237));
		opretOgGemBtn.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		opretOgGemBtn.setBounds(909, 730, 300, 67);
		layeredPane.add(opretOgGemBtn);
	}
}
