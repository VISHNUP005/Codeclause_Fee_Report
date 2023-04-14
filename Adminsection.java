package feeproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Adminsection extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adminsection frame = new Adminsection();
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
	public Adminsection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 558);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton viewaccountant = new JButton("VIEW ACCOUNTANTS");
		viewaccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Accountantview ac=new Accountantview();
				ac.setVisible(true);
			}
		});
		viewaccountant.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		viewaccountant.setBounds(185, 285, 259, 35);
		contentPane.add(viewaccountant);
		
		JLabel lblNewLabel = new JLabel("ADMIN SECTION");
		lblNewLabel.setBounds(198, 82, 208, 30);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setForeground(SystemColor.textHighlight);
		contentPane.add(lblNewLabel);
		
		JButton addaccountant = new JButton("ADD ACCOUNTANT");
		addaccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Addacc ac=new Addacc();
				ac.setVisible(true);			}
		});
		addaccountant.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		addaccountant.setBounds(185, 193, 259, 35);
		contentPane.add(addaccountant);
		
		JButton btnLogOut = new JButton("LOG OUT");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Feeproject fe=new Feeproject();
				fe.setVisible(true);
			}
		});
		btnLogOut.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		btnLogOut.setBounds(185, 331, 259, 35);
		contentPane.add(btnLogOut);
		
		JButton deleteaddcountant = new JButton("DELETE ACCOUNTANT");
		deleteaddcountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminAccdelete adel=new AdminAccdelete();
				adel.setVisible(true);
				
			}
		});
		deleteaddcountant.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		deleteaddcountant.setBounds(185, 239, 259, 35);
		contentPane.add(deleteaddcountant);
	}
}
