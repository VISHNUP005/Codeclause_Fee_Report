package feeproject;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Addstudent extends JFrame {

	private JPanel contentPane;
	private JTextField namefield;
	private JTextField emailfield;
	private JTextField coursefield;
	private JTextField cityfield;
	private JTextField statefield;
	private JTextField countryfield;
	private JTextField contactfield;
	private JTextField feefield;
	private JTextField paidfield;
	private JTextField duefield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addstudent frame = new Addstudent();
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
	public Addstudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 659);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADD STUDENT");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setBounds(36, 11, 203, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(SystemColor.info);
		lblNewLabel_1.setBounds(36, 68, 64, 24);
		contentPane.add(lblNewLabel_1);
		
		namefield = new JTextField();
		namefield.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		namefield.setBounds(198, 68, 238, 24);
		contentPane.add(namefield);
		namefield.setColumns(10);
		
		emailfield = new JTextField();
		emailfield.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		emailfield.setColumns(10);
		emailfield.setBounds(198, 103, 238, 24);
		contentPane.add(emailfield);
		
		coursefield = new JTextField();
		coursefield.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		coursefield.setColumns(10);
		coursefield.setBounds(198, 138, 238, 24);
		contentPane.add(coursefield);
		
		cityfield = new JTextField();
		cityfield.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		cityfield.setColumns(10);
		cityfield.setBounds(198, 414, 238, 24);
		contentPane.add(cityfield);
		
		statefield = new JTextField();
		statefield.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		statefield.setColumns(10);
		statefield.setBounds(198, 449, 238, 24);
		contentPane.add(statefield);
		
		countryfield = new JTextField();
		countryfield.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		countryfield.setColumns(10);
		countryfield.setBounds(198, 484, 238, 24);
		contentPane.add(countryfield);
		
		contactfield = new JTextField();
		contactfield.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		contactfield.setColumns(10);
		contactfield.setBounds(198, 519, 238, 24);
		contentPane.add(contactfield);
		
		JLabel lblNewLabel_1_1 = new JLabel("EMAIL:");
		lblNewLabel_1_1.setForeground(SystemColor.info);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(36, 103, 82, 24);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("COURSE");
		lblNewLabel_1_1_1.setForeground(SystemColor.info);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(36, 138, 103, 24);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("FEE:");
		lblNewLabel_1_1_1_1.setForeground(SystemColor.info);
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(36, 173, 64, 24);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JTextArea addressfield = new JTextArea();
		addressfield.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		addressfield.setBounds(198, 278, 238, 125);
		contentPane.add(addressfield);
		
		feefield = new JTextField();
		feefield.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		feefield.setColumns(10);
		feefield.setBounds(198, 173, 238, 24);
		contentPane.add(feefield);
		
		paidfield = new JTextField();
		paidfield.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		paidfield.setColumns(10);
		paidfield.setBounds(198, 208, 238, 24);
		contentPane.add(paidfield);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("PAID:");
		lblNewLabel_1_1_1_1_1.setForeground(SystemColor.info);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1.setBounds(36, 208, 64, 24);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("ADDRESS:");
		lblNewLabel_1_1_1_1_1_1.setForeground(SystemColor.info);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1.setBounds(36, 278, 103, 24);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("CITY:");
		lblNewLabel_1_1_1_1_1_1_1.setForeground(SystemColor.info);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(36, 414, 64, 24);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("STATE:");
		lblNewLabel_1_1_1_1_1_1_1_1.setForeground(SystemColor.info);
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(36, 449, 103, 24);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1 = new JLabel("COUNTRY:");
		lblNewLabel_1_1_1_1_1_1_1_1_1.setForeground(SystemColor.info);
		lblNewLabel_1_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1_1_1_1.setBounds(36, 484, 128, 24);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1_1_1 = new JLabel("CONTACT NO:");
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setForeground(SystemColor.info);
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1_1_1_1_1_1.setBounds(36, 519, 135, 24);
		contentPane.add(lblNewLabel_1_1_1_1_1_1_1_1_1_1);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Accountantsection ac=new Accountantsection();
				ac.setVisible(true);
			}
		});
		btnBack.setForeground(SystemColor.controlShadow);
		btnBack.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		btnBack.setBackground(SystemColor.textInactiveText);
		btnBack.setBounds(390, 570, 98, 33);
		contentPane.add(btnBack);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MySqlConnection sqlc=new MySqlConnection();
				Scanner sc=new Scanner(System.in);
				System.out.println("Hello");
				String name=namefield.getText();
				String email=emailfield.getText();
				String course=coursefield.getText();
				String fee=feefield.getText();
				String paid=paidfield.getText();
				String address=addressfield.getText();
				String city=cityfield.getText();
				String state=statefield.getText();
				String country=countryfield.getText();
				String contact=contactfield.getText();
				String due=duefield.getText();
				
				
				

					Connection con=sqlc.getConnection();
					if(name.equals("")||email.equals("")||course.equals("")||fee.equals("")||paid.equals("")||due.equals("")||address.equals("")||city.equals("")||state.equals("")||country.equals("")||contact.equals("")) {
						JOptionPane.showMessageDialog(null,"Pleae fill all the Fields..");
					}
					else {
						try {
							Statement stmt=con.createStatement();
//							PreparedStatement st = con.prepareStatement("insert into Atm1 values('Sudeep',1234567890123457,0000,'savings',90000);");
//							ResultSet r1 = st.executeQuery();
							stmt.executeUpdate("insert into studentfee (name,email,course,fee,paid,due,address,city,state,country,contact)values('"+name+"','"+email+"','"+course+"','"+fee+"','"+paid+"','"+due+"','"+address+"','"+city+"','"+state+"','"+country+"','"+contact+"')");
							System.out.println("Successfull !!");
							JOptionPane.showMessageDialog(null, "Student Add Successfull!");
							
							
						}
						catch(SQLException e1) {
							System.out.println(e1);
						}
						
						
					}
					
					
				}
			
		});
		btnAdd.setForeground(SystemColor.controlShadow);
		btnAdd.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		btnAdd.setBackground(SystemColor.textInactiveText);
		btnAdd.setBounds(96, 570, 98, 33);
		contentPane.add(btnAdd);
		
		JLabel duelbl = new JLabel("DUE:");
		duelbl.setForeground(SystemColor.info);
		duelbl.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		duelbl.setBounds(36, 243, 128, 24);
		contentPane.add(duelbl);
		
		duefield = new JTextField();
		duefield.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		duefield.setColumns(10);
		duefield.setBounds(198, 243, 238, 24);
		contentPane.add(duefield);
		
		JButton resetbtn = new JButton("RESET");
		resetbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				namefield.setText("");
				emailfield.setText("");
				coursefield.setText("");
				feefield.setText("");
				paidfield.setText("");
				addressfield.setText("");
				cityfield.setText("");
				statefield.setText("");
				countryfield.setText("");
				contactfield.setText("");
				duefield.setText("");
				
			}
		});
		resetbtn.setForeground(SystemColor.controlShadow);
		resetbtn.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		resetbtn.setBackground(SystemColor.textInactiveText);
		resetbtn.setBounds(242, 570, 98, 33);
		contentPane.add(resetbtn);
	}
}
class MySqlConnection
{
    private static String dbUrl = "jdbc:mysql:// localhost:3306/";
    private static String dbUsername = "root";
    private static String dbPassword = "SYSTEM";
    private static String dbName = "feereport";

    public  Connection getConnection()
    {
        Connection connection = null;
        try {
            
            connection = DriverManager.getConnection(dbUrl+ dbName, dbUsername, dbPassword);
        } catch (SQLException e) {
            System.out.println("Could not connect to DB: " + e.getMessage());
        }
        return connection;
    }
}
