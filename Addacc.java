package feeproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Addacc extends JFrame {

	private JPanel contentPane;
	private JTextField accnamefield;
	private JTextField emailfield;
	private JTextField contactfield;
	private JPasswordField passwordfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addacc frame = new Addacc();
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
	public Addacc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 553);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.windowText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setForeground(SystemColor.info);
		lblNewLabel.setBackground(SystemColor.info);
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblNewLabel.setBounds(35, 105, 56, 34);
		contentPane.add(lblNewLabel);
		
		JLabel addfaculty = new JLabel("ADD ACCOUNTANT");
		addfaculty.setBounds(181, 10, 228, 29);
		addfaculty.setFont(new Font("Times New Roman", Font.BOLD, 24));
		addfaculty.setForeground(SystemColor.info);
		contentPane.add(addfaculty);
		
		accnamefield = new JTextField();
		accnamefield.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		accnamefield.setBounds(181, 114, 228, 20);
		contentPane.add(accnamefield);
		accnamefield.setColumns(10);
		
		emailfield = new JTextField();
		emailfield.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		emailfield.setColumns(10);
		emailfield.setBounds(181, 199, 228, 20);
		contentPane.add(emailfield);
		
		contactfield = new JTextField();
		contactfield.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		contactfield.setColumns(10);
		contactfield.setBounds(181, 241, 228, 20);
		contentPane.add(contactfield);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(SystemColor.info);
		lblPassword.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblPassword.setBackground(SystemColor.info);
		lblPassword.setBounds(35, 145, 104, 34);
		contentPane.add(lblPassword);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email:");
		lblNewLabel_1_1.setForeground(SystemColor.info);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblNewLabel_1_1.setBackground(SystemColor.info);
		lblNewLabel_1_1.setBounds(35, 185, 56, 34);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Contact No.:");
		lblNewLabel_1_1_1.setForeground(SystemColor.info);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblNewLabel_1_1_1.setBackground(SystemColor.info);
		lblNewLabel_1_1_1.setBounds(35, 227, 104, 34);
		contentPane.add(lblNewLabel_1_1_1);
		
		passwordfield = new JPasswordField();
		passwordfield.setBounds(181, 154, 228, 20);
		contentPane.add(passwordfield);
		
		JButton addbtn = new JButton("ADD");
		addbtn.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		addbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				///////////////////ACCOUNTANT ADD////////////////
				MySqlConnection sqlc=new MySqlConnection();
				Scanner sc=new Scanner(System.in);
				System.out.println("Hello");
				
				
				String name=accnamefield.getText();
				String password=passwordfield.getText();
				String email=emailfield .getText();
				String contact=contactfield .getText();
				if(name.equals("")|password.equals("")||email.equals("")||contact.equals("")) {
					JOptionPane.showMessageDialog(null,"Please Fill all Fields..");
					
				}
				else {
					Connection con=sqlc.getConnection();
					try {
						Statement stmt=con.createStatement();
//						PreparedStatement st = con.prepareStatement("insert into Atm1 values('Sudeep',1234567890123457,0000,'savings',90000);");
//						ResultSet r1 = st.executeQuery();
						stmt.executeUpdate("insert into Accountant (name,password,email,contact)values('"+name+"','"+password+"','"+email+"','"+contact+"');");
						System.out.println("Successfull !!");
						Successacc su=new Successacc();
						su.setVisible(true);
						
						
					}
					catch(SQLException e1) {
						System.out.println(e1);
					}
					
				}
					
				
				
				
				
				
				
				
				
			}
		});
		addbtn.setBounds(66, 326, 89, 23);
		contentPane.add(addbtn);
		
		JButton resetbtn = new JButton("RESET");
		resetbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/////////////////reset
				accnamefield.setText("");
				passwordfield.setText("");
				contactfield.setText("");
				emailfield.setText("");
				
			}
		});
		resetbtn.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		resetbtn.setBounds(222, 326, 89, 23);
		contentPane.add(resetbtn);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adminsection ad=new Adminsection();
				ad.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnBack.setBounds(374, 326, 89, 23);
		contentPane.add(btnBack);
	}

}

