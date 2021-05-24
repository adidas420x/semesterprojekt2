package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import java.awt.Font;
import javax.swing.JLabel;

public class ForsideGui extends JFrame {
	public ForsideGui() {
		getContentPane().setForeground(new Color(41, 140, 240));
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBackground(new Color(0, 0, 128));
		layeredPane.setForeground(new Color(0, 0, 128));
		getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JButton forsideOpretOrdreBtn = new JButton("Opret ordre");
		forsideOpretOrdreBtn.setBackground(new Color(23, 39, 52));
		forsideOpretOrdreBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		forsideOpretOrdreBtn.setBounds(40, 265, 300, 100);
		layeredPane.add(forsideOpretOrdreBtn);
		
		JButton forsideAktiveOrdreBtn = new JButton("Aktive ordre");
		forsideAktiveOrdreBtn.setBackground(new Color(23, 39, 52));
		forsideAktiveOrdreBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		forsideAktiveOrdreBtn.setBounds(40, 375, 300, 100);
		layeredPane.add(forsideAktiveOrdreBtn);
		
		JButton forsideLagerBtn = new JButton("Lager");
		forsideLagerBtn.setBackground(new Color(23, 39, 52));
		forsideLagerBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		forsideLagerBtn.setBounds(385, 265, 300, 210);
		layeredPane.add(forsideLagerBtn);
		
		JButton forsideEventsBtn = new JButton("Events");
		forsideEventsBtn.setBackground(new Color(23, 39, 52));
		forsideEventsBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		forsideEventsBtn.setBounds(730, 265, 300, 210);
		layeredPane.add(forsideEventsBtn);
		
		JLabel lblDeadlight = new JLabel("DEADLIGHT");
		lblDeadlight.setForeground(Color.WHITE);
		lblDeadlight.setFont(new Font("Arial", Font.BOLD, 66));
		lblDeadlight.setBounds(613, 24, 417, 67);
		layeredPane.add(lblDeadlight);
		
		JLabel lblLydisken = new JLabel("LYDIKSEN");
		lblLydisken.setForeground(Color.DARK_GRAY);
		lblLydisken.setFont(new Font("Arial", Font.BOLD, 76));
		lblLydisken.setBounds(613, 83, 385, 67);
		layeredPane.add(lblLydisken);
	}
	

	private JPanel contentPane;
}
