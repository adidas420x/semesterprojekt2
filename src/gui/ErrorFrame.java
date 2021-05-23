package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ErrorFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErrorFrame frame = new ErrorFrame();
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
	public ErrorFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setBackground(new Color(41, 140, 240));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JButton btnAccept = new JButton("OK");
		btnAccept.setBackground(Color.GRAY);
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAccept.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		btnAccept.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnAccept.setBounds(110, 180, 182, 49);
		layeredPane.add(btnAccept);
		
		JTextPane errorTxtBox = new JTextPane();
		errorTxtBox.setEditable(false);
		errorTxtBox.setFont(new Font("Tahoma", Font.PLAIN, 24));
		errorTxtBox.setBackground(UIManager.getColor("Button.background"));
		errorTxtBox.setText("Event ID ikke fundet.");
		errorTxtBox.setBounds(88, 78, 236, 64);
		layeredPane.add(errorTxtBox);
		errorTxtBox.setBackground(new Color(41, 140, 240));

	}

}
