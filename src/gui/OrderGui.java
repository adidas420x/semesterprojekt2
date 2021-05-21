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
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JButton idSgBtn = new JButton("Søg");
		idSgBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		idSgBtn.setBounds(239, 370, 90, 40);
		layeredPane.add(idSgBtn);
		
		JButton navnSgBtn = new JButton("Søg");
		navnSgBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		navnSgBtn.setBounds(239, 315, 90, 40);
		layeredPane.add(navnSgBtn);
		
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
		annullerBtn.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		annullerBtn.setBounds(908, 654, 145, 67);
		layeredPane.add(annullerBtn);
		
		JButton accepterBtn = new JButton("Accepter");
		accepterBtn.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		accepterBtn.setBounds(1064, 654, 145, 67);
		layeredPane.add(accepterBtn);
		
		JButton tilfjBtn = new JButton("Tilføj");
		tilfjBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tilfjBtn.setBounds(239, 650, 90, 40);
		layeredPane.add(tilfjBtn);
		
		txtIndtastAntal = new JTextField();
		txtIndtastAntal.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		txtIndtastAntal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtIndtastAntal.setText("");
			}
		});
		txtIndtastAntal.setText("Indtast antal");
		txtIndtastAntal.setBounds(27, 650, 302, 40);
		layeredPane.add(txtIndtastAntal);
		txtIndtastAntal.setColumns(10);
		
		txtIndtastSgeord = new JTextField();
		txtIndtastSgeord.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		txtIndtastSgeord.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtIndtastSgeord.setText("");
			}
		});
		txtIndtastSgeord.setText("Indtast søgeord");
		txtIndtastSgeord.setBounds(27, 315, 302, 40);
		layeredPane.add(txtIndtastSgeord);
		txtIndtastSgeord.setColumns(10);
		
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
		txtNavnForEvent.setText("Navn for event:");
		txtNavnForEvent.setBounds(27, 133, 302, 40);
		layeredPane.add(txtNavnForEvent);
		txtNavnForEvent.setColumns(10);
		txtNavnForEvent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNavnForEvent.setText("");
			}
		});
		
		JScrollPane scrollPaneFindUdstyr = new JScrollPane();
		scrollPaneFindUdstyr.setBounds(27, 430, 302, 215);
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
		comboBoxSkabeloner.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		comboBoxSkabeloner.setBounds(27, 183, 302, 40);
		layeredPane.add(comboBoxSkabeloner);
		
		comboBoxSkabeloner.setEditable(true);
		comboBoxSkabeloner.addItem("Nibe 2019");
		comboBoxSkabeloner.addItem("Samsung livestream event 2020");
		comboBoxSkabeloner.addItem("2 vogne, 4 ekstra kamera");
		comboBoxSkabeloner.addItem("1 vogn, 2 ekstra kamera");
		
		comboBoxSkabeloner.setSelectedItem("Skabeloner");
		
		txtEventStartDate = new JTextField();
		txtEventStartDate.setText("dd-mm-yyyy");
		txtEventStartDate.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		txtEventStartDate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEventStartDate.setText("");
			}
		});
		txtEventStartDate.setColumns(10);
		txtEventStartDate.setBounds(27, 233, 128, 40);
		layeredPane.add(txtEventStartDate);
		
		txtEventEndDate = new JTextField();
		txtEventEndDate.setText("dd-mm-yyyy");
		txtEventEndDate.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		txtEventEndDate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEventEndDate.setText("");
			}
		});
		txtEventEndDate.setColumns(10);
		txtEventEndDate.setBounds(201, 233, 128, 40);
		layeredPane.add(txtEventEndDate);
		
		JLabel lblNewLabel = new JLabel("-");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblNewLabel.setBounds(169, 244, 15, 13);
		layeredPane.add(lblNewLabel);
		
		JScrollPane scrollPaneValgtUdstyr = new JScrollPane();
		scrollPaneValgtUdstyr.setBounds(494, 315, 302, 330);
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
		txtIndtastID.setText("Indtast ID");
		txtIndtastID.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		txtIndtastID.setColumns(10);
		txtIndtastID.setBounds(27, 370, 302, 40);
		layeredPane.add(txtIndtastID);
	}
}
