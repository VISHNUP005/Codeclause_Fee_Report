package feeproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginAdmin extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginAdmin frame = new LoginAdmin();
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
	public LoginAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 554);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.foreground"));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		username = new JTextField();
		username.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 19));
		username.setBounds(236, 208, 231, 33);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("USER:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBounds(81, 206, 96, 33);
		contentPane.add(lblNewLabel);
		
		JLabel passwordlbl = new JLabel("PASSWORD:");
		passwordlbl.setForeground(Color.WHITE);
		passwordlbl.setFont(new Font("Tahoma", Font.PLAIN, 22));
		passwordlbl.setBounds(81, 266, 145, 33);
		contentPane.add(passwordlbl);
		
		lblNewLabel_1 = new JLabel("ADMIN LOGIN");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1.setForeground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		lblNewLabel_1.setBounds(192, 108, 203, 33);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String uname=username.getText();
				String pass=password.getText();
				
				if(uname.equals("vishnu")&&pass.equals("1234")) {
					
					JOptionPane.showMessageDialog(null,"You have login Successfully");
					Adminsection ad=new Adminsection();
					ad.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null,"Login Failed");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(203, 360, 108, 23);
		contentPane.add(btnNewButton);
		
		password = new JPasswordField();
		password.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		password.setBounds(236, 271, 231, 33);
		contentPane.add(password);
	}
}
