package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import java.awt.Font;

public class ForsideGui extends JFrame {
	public ForsideGui() {
		getContentPane().setForeground(new Color(100, 149, 237));
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBackground(new Color(0, 0, 128));
		layeredPane.setForeground(new Color(0, 0, 128));
		getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JButton forsideOpretOrdreBtn = new JButton("Opret ordre");
		forsideOpretOrdreBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		forsideOpretOrdreBtn.setBounds(40, 265, 300, 100);
		layeredPane.add(forsideOpretOrdreBtn);
		
		JButton forsideAktiveOrdreBtn = new JButton("Aktive ordre");
		forsideAktiveOrdreBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		forsideAktiveOrdreBtn.setBounds(40, 375, 300, 100);
		layeredPane.add(forsideAktiveOrdreBtn);
		
		JButton forsideLagerBtn = new JButton("Lager");
		forsideLagerBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		forsideLagerBtn.setBounds(387, 265, 300, 210);
		layeredPane.add(forsideLagerBtn);
		
		JButton forsideEventsBtn = new JButton("Events");
		forsideEventsBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		forsideEventsBtn.setBounds(732, 265, 300, 210);
		layeredPane.add(forsideEventsBtn);
	}
	

	private JPanel contentPane;
}
