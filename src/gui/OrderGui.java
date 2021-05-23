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
import javax.swing.SwingConstants;

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
		contentPane.setBackground(new Color(41, 140, 240));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setForeground(new Color(0, 0, 128));
		layeredPane.setBackground(new Color(0, 0, 128));
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JButton idSgBtn = new JButton("Søg");
		idSgBtn.setBackground(Color.GRAY);
		idSgBtn.setFont(new Font("Arial", Font.BOLD, 20));
		idSgBtn.setBounds(537, 429, 90, 40);
		layeredPane.add(idSgBtn);
		
		JButton navnSgBtn = new JButton("Søg");
		navnSgBtn.setBackground(Color.GRAY);
		navnSgBtn.setFont(new Font("Arial", Font.BOLD, 20));
		navnSgBtn.setBounds(537, 378, 90, 40);
		layeredPane.add(navnSgBtn);
		
		JButton eventBtn = new JButton("Events");
		eventBtn.setBackground(new Color(23, 39, 52));
		eventBtn.setForeground(new Color(255, 255, 255));
		eventBtn.setFont(new Font("Arial", Font.BOLD, 18));
		eventBtn.setBounds(567, 27, 160, 67);
		layeredPane.add(eventBtn);
		
		JButton opretOrdreBtn = new JButton("Opret ordre");
		opretOrdreBtn.setBackground(new Color(23, 39, 52));
		opretOrdreBtn.setForeground(new Color(255, 255, 255));
		opretOrdreBtn.setFont(new Font("Arial", Font.BOLD, 18));
		opretOrdreBtn.setBounds(27, 27, 160, 67);
		opretOrdreBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		layeredPane.add(opretOrdreBtn);
		
		JButton lagerBtn = new JButton("Lager");
		lagerBtn.setBackground(new Color(23, 39, 52));
		lagerBtn.setForeground(new Color(255, 255, 255));
		lagerBtn.setFont(new Font("Arial", Font.BOLD, 18));
		lagerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		lagerBtn.setBounds(387, 27, 160, 67);
		layeredPane.add(lagerBtn);
		
		JButton annullerBtn = new JButton("Annuller ordre");
		annullerBtn.setBackground(new Color(212, 91, 61));
		annullerBtn.setFont(new Font("Arial", Font.BOLD, 18));
		annullerBtn.setBounds(1446, 934, 200, 67);
		layeredPane.add(annullerBtn);
		
		JButton opretBtn = new JButton("Opret ordre");
		opretBtn.setBackground(new Color(51, 176, 118));
		opretBtn.setFont(new Font("Arial", Font.BOLD, 18));
		opretBtn.setBounds(1670, 934, 200, 67);
		layeredPane.add(opretBtn);
		
		JButton tilfjBtn = new JButton("Tilføj");
		tilfjBtn.setBackground(Color.GRAY);
		tilfjBtn.setFont(new Font("Arial", Font.BOLD, 20));
		tilfjBtn.setBounds(537, 891, 90, 40);
		layeredPane.add(tilfjBtn);
		
		txtIndtastAntal = new JTextField();
		txtIndtastAntal.setBackground(new Color(135, 206, 250));
		txtIndtastAntal.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtIndtastAntal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtIndtastAntal.setText("");
			}
		});
		txtIndtastAntal.setText("Indtast antal");
		txtIndtastAntal.setBounds(27, 891, 503, 40);
		layeredPane.add(txtIndtastAntal);
		txtIndtastAntal.setColumns(10);
		
		txtIndtastSgeord = new JTextField();
		txtIndtastSgeord.setBackground(new Color(135, 206, 250));
		txtIndtastSgeord.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtIndtastSgeord.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtIndtastSgeord.setText("");
			}
		});
		txtIndtastSgeord.setText("Indtast navn på udstyr");
		txtIndtastSgeord.setBounds(27, 379, 503, 40);
		layeredPane.add(txtIndtastSgeord);
		txtIndtastSgeord.setColumns(10);
		
		JButton aktiveOrdrerBtn = new JButton("Aktive ordrer");
		aktiveOrdrerBtn.setBackground(new Color(23, 39, 52));
		aktiveOrdrerBtn.setForeground(new Color(255, 255, 255));
		aktiveOrdrerBtn.setFont(new Font("Arial", Font.BOLD, 18));
		aktiveOrdrerBtn.setBounds(207, 27, 160, 67);
		
		layeredPane.add(aktiveOrdrerBtn);
		
		JLabel lblDeadlight = new JLabel("DEADLIGHT");
		lblDeadlight.setForeground(new Color(255, 255, 255));
		lblDeadlight.setFont(new Font("Arial", Font.BOLD, 66));
		lblDeadlight.setBounds(1485, 11, 385, 67);
		layeredPane.add(lblDeadlight);
		
		JLabel lblLydisken = new JLabel("LYDIKSEN");
		lblLydisken.setForeground(Color.DARK_GRAY);
		lblLydisken.setFont(new Font("Arial", Font.BOLD, 76));
		lblLydisken.setBounds(1485, 67, 385, 67);
		layeredPane.add(lblLydisken);
		
		txtNavnForEvent = new JTextField();
		txtNavnForEvent.setBackground(new Color(135, 206, 250));
		txtNavnForEvent.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtNavnForEvent.setText("Søg efter event ID");
		txtNavnForEvent.setBounds(27, 158, 503, 40);
		layeredPane.add(txtNavnForEvent);
		txtNavnForEvent.setColumns(10);
		txtNavnForEvent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNavnForEvent.setText("");
			}
		});
		
		JScrollPane scrollPaneFindUdstyr = new JScrollPane();
		scrollPaneFindUdstyr.setBounds(27, 480, 600, 400);
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
		comboBoxSkabeloner.setFont(new Font("Calibri", Font.PLAIN, 20));
		comboBoxSkabeloner.setBounds(27, 231, 503, 40);
		layeredPane.add(comboBoxSkabeloner);
		
		comboBoxSkabeloner.setEditable(true);
		comboBoxSkabeloner.addItem("Nibe 2019");
		comboBoxSkabeloner.addItem("Samsung livestream event 2020");
		comboBoxSkabeloner.addItem("2 vogne, 4 ekstra kamera");
		comboBoxSkabeloner.addItem("1 vogn, 2 ekstra kamera");
		
		comboBoxSkabeloner.setSelectedItem("Skabeloner");
		
		txtEventStartDate = new JTextField();
		txtEventStartDate.setHorizontalAlignment(SwingConstants.CENTER);
		txtEventStartDate.setBackground(new Color(135, 206, 250));
		txtEventStartDate.setText("DD-MM-YYYY");
		txtEventStartDate.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtEventStartDate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEventStartDate.setText("");
			}
		});
		txtEventStartDate.setColumns(10);
		txtEventStartDate.setBounds(27, 302, 240, 40);
		layeredPane.add(txtEventStartDate);
		
		txtEventEndDate = new JTextField();
		txtEventEndDate.setHorizontalAlignment(SwingConstants.CENTER);
		txtEventEndDate.setBackground(new Color(135, 206, 250));
		txtEventEndDate.setText("DD-MM-YYYY");
		txtEventEndDate.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtEventEndDate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEventEndDate.setText("");
			}
		});
		txtEventEndDate.setColumns(10);
		txtEventEndDate.setBounds(290, 302, 240, 40);
		layeredPane.add(txtEventEndDate);
		
		JScrollPane scrollPaneValgtUdstyr = new JScrollPane();
		scrollPaneValgtUdstyr.setBounds(1270, 387, 600, 500);
		layeredPane.add(scrollPaneValgtUdstyr);
		
		valgtUdstyrTable = new JTable();
		scrollPaneValgtUdstyr.setViewportView(valgtUdstyrTable);
		valgtUdstyrTable.setFillsViewportHeight(true);
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
		txtIndtastID.setText("Indtast ID på udstyr");
		txtIndtastID.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtIndtastID.setColumns(10);
		txtIndtastID.setBounds(27, 429, 503, 40);
		layeredPane.add(txtIndtastID);
		
		JButton skabelonVlgBtn = new JButton("Vælg");
		skabelonVlgBtn.setBackground(Color.GRAY);
		skabelonVlgBtn.setFont(new Font("Arial", Font.BOLD, 20));
		skabelonVlgBtn.setBounds(537, 231, 90, 40);
		layeredPane.add(skabelonVlgBtn);
		
		JButton navnSgBtn_1 = new JButton("Søg");
		navnSgBtn_1.setFont(new Font("Arial", Font.BOLD, 20));
		navnSgBtn_1.setBackground(Color.GRAY);
		navnSgBtn_1.setBounds(537, 159, 90, 40);
		layeredPane.add(navnSgBtn_1);
		
		JLabel lblStartdato = new JLabel("Startdato");
		lblStartdato.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblStartdato.setBounds(27, 282, 79, 25);
		layeredPane.add(lblStartdato);
		
		JLabel lblSlutdato = new JLabel("Slutdato");
		lblSlutdato.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblSlutdato.setBounds(290, 282, 71, 25);
		layeredPane.add(lblSlutdato);
		
		JLabel lblSgEfterUdstyr = new JLabel("Søg efter udstyr");
		lblSgEfterUdstyr.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblSgEfterUdstyr.setBounds(27, 353, 132, 25);
		layeredPane.add(lblSgEfterUdstyr);
		
		JLabel lblVlgSkabelon = new JLabel("Vælg skabelon");
		lblVlgSkabelon.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblVlgSkabelon.setBounds(27, 209, 132, 25);
		layeredPane.add(lblVlgSkabelon);
		
		JLabel lblSgEfterEvent = new JLabel("Søg efter event");
		lblSgEfterEvent.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblSgEfterEvent.setBounds(27, 136, 132, 25);
		layeredPane.add(lblSgEfterEvent);
		
	}
}
