package feeproject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Feeproject extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Feeproject frame = new Feeproject();
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
	public Feeproject() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 528);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.foreground"));
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(216, 96, 104, 43);
		contentPane.add(lblNewLabel);
		
		JButton accountantbtn = new JButton("ACCOUNTANT");
		accountantbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Accountantsection act=new Accountantsection();
				act.setVisible(true);
			}
		});
		accountantbtn.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		accountantbtn.setBounds(154, 253, 208, 33);
		contentPane.add(accountantbtn);
		
		JButton adminbtn_1 = new JButton("ADMIN");
		adminbtn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginAdmin lg=new LoginAdmin();
				lg.setVisible(true);
			}
		});
		adminbtn_1.setFont(new Font("Times New Roman", Font.ITALIC, 22));
		adminbtn_1.setBounds(154, 172, 208, 33);
		contentPane.add(adminbtn_1);
	}
}
