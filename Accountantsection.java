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
import java.sql.Connection;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Accountantsection extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accountantsection frame = new Accountantsection();
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
	public Accountantsection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 485);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.windowText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ACCOUNTANT SECTION");
		lblNewLabel.setBounds(143, 41, 299, 30);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setForeground(SystemColor.textHighlight);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("ADD STUDENT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Addstudent ad=new Addstudent();

				
				
				ad.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("MS PGothic", Font.ITALIC, 20));
		btnNewButton.setBounds(32, 121, 188, 30);
		contentPane.add(btnNewButton);
		
		JButton btnEditStudent = new JButton("EDIT STUDENT");
		btnEditStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Editstudent st=new Editstudent();
				st.setVisible(true);
			}
		});
		btnEditStudent.setFont(new Font("MS PGothic", Font.ITALIC, 20));
		btnEditStudent.setBounds(329, 205, 188, 30);
		contentPane.add(btnEditStudent);
		
		JButton btnviewstudent = new JButton("VIEW STUDENT");
		btnviewstudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadstudent ld=new loadstudent();
				ld.setVisible(true);
			}
		});
		btnviewstudent.setFont(new Font("MS PGothic", Font.ITALIC, 20));
		btnviewstudent.setBounds(329, 121, 188, 30);
		contentPane.add(btnviewstudent);
		
		JButton logoutbtn = new JButton("Log out");
		logoutbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Feeproject fe=new Feeproject();
				fe.setVisible(true);
			}
		});
		logoutbtn.setBackground(Color.LIGHT_GRAY);
		logoutbtn.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 20));
		logoutbtn.setBounds(216, 275, 116, 30);
		contentPane.add(logoutbtn);
		
		JButton allstudentbtn = new JButton("STUDENT LIST");
		allstudentbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Studentlist stl=new Studentlist();
				stl.setVisible(true);
			}
		});
		allstudentbtn.setFont(new Font("MS PGothic", Font.ITALIC, 20));
		allstudentbtn.setBounds(32, 205, 188, 30);
		contentPane.add(allstudentbtn);
	}
}
