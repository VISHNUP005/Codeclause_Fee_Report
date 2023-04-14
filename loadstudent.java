package feeproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class loadstudent extends JFrame {

	private JPanel contentPane;
	private JTextField idfield;
	JLabel namelbl;
	JLabel courselbl;
	JLabel emaillbl;
	JLabel contactlbl;
	JLabel countrylbl;
	JLabel statelbl;
	JLabel citylbl;
	JLabel paidlbl;
	JLabel duelbl;
	JLabel feelbl;
	JLabel addresslbl; 
	private JButton backbtn;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loadstudent frame = new loadstudent();
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
	public loadstudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 584);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Student ID:");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblNewLabel.setBounds(10, 37, 142, 14);
		contentPane.add(lblNewLabel);
		
		idfield = new JTextField();
		idfield.setFont(new Font("Tempus Sans ITC", Font.BOLD, 21));
		idfield.setBounds(183, 36, 129, 20);
		contentPane.add(idfield);
		idfield.setColumns(10);
		
		JButton Searchbtn = new JButton("Search");
		Searchbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				////////////////MySqlConnection sqlc=new MySqlConnection();
				Scanner sc=new Scanner(System.in);
				System.out.println("Hello");
				int id=Integer.parseInt(idfield.getText());
				MySqlConnection sqlc=new MySqlConnection();
				
				
				
				
				
					Connection con=sqlc.getConnection();
					try {
						PreparedStatement st = con.prepareStatement("select * from studentfee where id='"+id+"'");
						ResultSet r1 = st.executeQuery();
						
						while(r1.next()) {
							String name=r1.getString("name");
							String email=r1.getString("email");
							String course=r1.getString("course");
							String fee=r1.getString("fee");
							String due=r1.getString("due");
							String address=r1.getString("address");
							String state=r1.getString("state");
							String city=r1.getString("city");
							String country=r1.getString("country");
							String contact=r1.getString("contact");
							String paid=r1.getString("paid");
							
							namelbl.setText("name"+": "+name);
							emaillbl.setText("Email:"+" "+email);
							courselbl.setText("Course:"+" "+course);
							feelbl.setText("fee:"+" "+fee);
							paidlbl.setText("Paid:"+" "+paid);
							duelbl.setText("Due:"+" "+due);
							addresslbl.setText("Address:"+" "+address);
							statelbl.setText("State:"+" "+state);
							citylbl.setText("City:"+" "+city);
							
							countrylbl.setText("country:"+" "+country);
							contactlbl.setText("Contact:"+" "+contact);
				
							
							
							
							
							
						}
						
						
					}
					catch(SQLException e1) {
						System.out.println(e1);
					}
						
						
						
						
						
					}
					
					
				
			
		});
		Searchbtn.setBackground(Color.PINK);
		Searchbtn.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		Searchbtn.setBounds(330, 32, 97, 29);
		contentPane.add(Searchbtn);
		
		JLabel lblNewLabel_1 = new JLabel("________________________________________________________________________");
		lblNewLabel_1.setForeground(Color.GRAY);
		lblNewLabel_1.setBounds(10, 62, 481, 14);
		contentPane.add(lblNewLabel_1);
		
		 namelbl = new JLabel("");
		namelbl.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		namelbl.setForeground(Color.WHITE);
		namelbl.setBounds(25, 110, 413, 20);
		contentPane.add(namelbl);
		
		 emaillbl = new JLabel("");
		emaillbl.setForeground(Color.WHITE);
		emaillbl.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		emaillbl.setBounds(25, 141, 413, 20);
		contentPane.add(emaillbl);
		
		courselbl = new JLabel("");
		courselbl.setForeground(Color.WHITE);
		courselbl.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		courselbl.setBounds(25, 172, 413, 20);
		contentPane.add(courselbl);
		
		feelbl = new JLabel("");
		feelbl.setForeground(Color.WHITE);
		feelbl.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		feelbl.setBounds(25, 203, 413, 20);
		contentPane.add(feelbl);
		
		paidlbl = new JLabel("");
		paidlbl.setForeground(Color.WHITE);
		paidlbl.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		paidlbl.setBounds(25, 234, 413, 20);
		contentPane.add(paidlbl);
		
		 duelbl = new JLabel("");
		duelbl.setForeground(Color.RED);
		duelbl.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		duelbl.setBounds(25, 262, 413, 20);
		contentPane.add(duelbl);
		
		addresslbl = new JLabel("");
		addresslbl.setForeground(Color.WHITE);
		addresslbl.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		addresslbl.setBounds(25, 292, 413, 20);
		contentPane.add(addresslbl);
		
		citylbl = new JLabel("");
		citylbl.setForeground(Color.WHITE);
		citylbl.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		citylbl.setBounds(25, 323, 413, 20);
		contentPane.add(citylbl);
		
		statelbl = new JLabel("");
		statelbl.setForeground(Color.WHITE);
		statelbl.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		statelbl.setBounds(25, 354, 413, 20);
		contentPane.add(statelbl);
		
		countrylbl = new JLabel("");
		countrylbl.setForeground(Color.WHITE);
		countrylbl.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		countrylbl.setBounds(25, 381, 413, 20);
		contentPane.add(countrylbl);
		
		contactlbl = new JLabel("");
		contactlbl.setForeground(Color.WHITE);
		contactlbl.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		contactlbl.setBounds(25, 412, 413, 20);
		contentPane.add(contactlbl);
		
		backbtn = new JButton("BACK");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Accountantsection ac=new Accountantsection();
				ac.setVisible(true);
			}
		});
		backbtn.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		backbtn.setBounds(394, 83, 84, 29);
		contentPane.add(backbtn);
	}

}

