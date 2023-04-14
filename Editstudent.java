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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Editstudent extends JFrame {

	private JPanel contentPane;
	private JTextField idfield;
	private JTextField namefield;
	private JTextField emailfield;
	private JTextField coursefield;
	private JTextField feefield;
	private JTextField paidfield;
	private JTextField duefield;
	private JTextField addressfield;
	private JTextField statefield;
	private JTextField cityfield;
	private JTextField contactfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editstudent frame = new Editstudent();
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
	public Editstudent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 572);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the Student id:-");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		lblNewLabel.setBounds(22, 34, 216, 25);
		contentPane.add(lblNewLabel);
		
		idfield = new JTextField();
		idfield.setFont(new Font("Tahoma", Font.PLAIN, 19));
		idfield.setBounds(233, 31, 96, 29);
		contentPane.add(idfield);
		idfield.setColumns(10);
		
		JButton loadbtn = new JButton("Load");
		loadbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
						String contact=r1.getString("contact");
						
						String paid=r1.getString("paid");
						
						namefield.setText(name);
						emailfield.setText(email);
						coursefield.setText(course);
						feefield.setText(fee);
						paidfield.setText(paid);
						duefield.setText(due);
						addressfield.setText(address);
						statefield.setText(state);
						cityfield.setText(city);
						
						contactfield.setText(contact);
						
			
						
						
						
						
						
					}
					
					
				}
				catch(SQLException e1) {
					System.out.println(e1);
				}
			}
		});
		loadbtn.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		loadbtn.setBounds(387, 35, 89, 25);
		contentPane.add(loadbtn);
		
		JLabel lblNewLabel_1 = new JLabel("________________________________________________________________________");
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(22, 70, 489, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(22, 108, 75, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Email:");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2_1.setBounds(22, 144, 75, 25);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Course:");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2_1_1.setBounds(22, 182, 75, 25);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Fee:");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2_1_1_1.setBounds(22, 218, 75, 25);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Paid:");
		lblNewLabel_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2_1_1_1_1.setBounds(22, 254, 75, 25);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Due:");
		lblNewLabel_2_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2_1_1_1_1_1.setBounds(22, 290, 75, 25);
		contentPane.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("Address:");
		lblNewLabel_2_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2_1_1_1_1_1_1.setBounds(22, 326, 89, 25);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1 = new JLabel("State:");
		lblNewLabel_2_1_1_1_1_1_1_1.setToolTipText("");
		lblNewLabel_2_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2_1_1_1_1_1_1_1.setBounds(22, 362, 75, 25);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1 = new JLabel("City:");
		lblNewLabel_2_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2_1_1_1_1_1_1_1_1.setBounds(22, 398, 75, 25);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1_1 = new JLabel("Contact:");
		lblNewLabel_2_1_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel_2_1_1_1_1_1_1_1_1_1.setBounds(22, 434, 89, 25);
		contentPane.add(lblNewLabel_2_1_1_1_1_1_1_1_1_1);
		
		namefield = new JTextField();
		namefield.setForeground(Color.ORANGE);
		namefield.setFont(new Font("Tahoma", Font.ITALIC, 22));
		namefield.setBounds(157, 108, 300, 28);
		contentPane.add(namefield);
		namefield.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				////////////actionint id=Integer.parseInt(idfield.getText());
				MySqlConnection sqlc=new MySqlConnection();
				int id=Integer.parseInt(idfield.getText());
				
				
				
				
				Connection con=sqlc.getConnection();
				try {
					Statement stmt=con.createStatement();
					

						String name=namefield.getText();
						String email=emailfield.getText();
						String course=coursefield.getText();
						String fee=feefield.getText();
						String paid=paidfield.getText();
						String due=duefield.getText();
						String address=addressfield.getText();
						String state=statefield.getText();
						String city=cityfield.getText();
						
						JOptionPane.showMessageDialog(null, "Edit Sucessfull!!");
						String contact=contactfield.getText();
						String sql="update studentfee set name='"+name+"' where id='"+id+"';";
			    		stmt.executeUpdate(sql);
			    		String sql1="update studentfee set email='"+email+"' where id='"+id+"';";
			    		stmt.executeUpdate(sql1);
			    		String sql2="update studentfee set course='"+course+"' where id='"+id+"';";
			    		stmt.executeUpdate(sql2);
			    		String sql3="update studentfee set fee='"+fee+"' where id='"+id+"';";
			    		stmt.executeUpdate(sql3);
			    		String sql4="update studentfee set paid='"+paid+"' where id='"+id+"';";
			    		stmt.executeUpdate(sql4);
			    		String sql5="update studentfee set due='"+due+"' where id="+id+"';";
			    		stmt.executeUpdate(sql5);
			    		
			    		String sql6="update studentfee set address='"+address+"' where id='"+id+"';";
			    		stmt.executeUpdate(sql6);
			    		String sql7="update studentfee set state='"+state+"' where id='"+id+"';";
			    		stmt.executeUpdate(sql7);
			    		String sql8="update studentfee set city='"+city+"' where id='"+id+"';";
			    		stmt.executeUpdate(sql8);
			    		String sql9="update studentfee set contact='"+contact+"' where id='"+id+"';";
			    		stmt.executeUpdate(sql9);
			    		JOptionPane.showMessageDialog(null, "Edit Sucessfull!!");
		
				}
				catch(SQLException e1) {
					System.out.println(e1);
				}
			
				
				
			}
		});
		btnSave.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		btnSave.setBounds(103, 499, 89, 25);
		contentPane.add(btnSave);
		
		emailfield = new JTextField();
		emailfield.setFont(new Font("Tahoma", Font.ITALIC, 22));
		emailfield.setColumns(10);
		emailfield.setBounds(157, 144, 300, 28);
		contentPane.add(emailfield);
		
		coursefield = new JTextField();
		coursefield.setFont(new Font("Tahoma", Font.ITALIC, 22));
		coursefield.setColumns(10);
		coursefield.setBounds(157, 179, 300, 28);
		contentPane.add(coursefield);
		
		feefield = new JTextField();
		feefield.setFont(new Font("Tahoma", Font.ITALIC, 22));
		feefield.setColumns(10);
		feefield.setBounds(157, 215, 300, 28);
		contentPane.add(feefield);
		
		paidfield = new JTextField();
		paidfield.setFont(new Font("Tahoma", Font.ITALIC, 22));
		paidfield.setColumns(10);
		paidfield.setBounds(157, 251, 300, 28);
		contentPane.add(paidfield);
		
		duefield = new JTextField();
		duefield.setFont(new Font("Tahoma", Font.ITALIC, 22));
		duefield.setColumns(10);
		duefield.setBounds(157, 287, 300, 28);
		contentPane.add(duefield);
		
		addressfield = new JTextField();
		addressfield.setFont(new Font("Tahoma", Font.ITALIC, 22));
		addressfield.setColumns(10);
		addressfield.setBounds(157, 323, 300, 28);
		contentPane.add(addressfield);
		
		statefield = new JTextField();
		statefield.setFont(new Font("Tahoma", Font.ITALIC, 22));
		statefield.setColumns(10);
		statefield.setBounds(157, 359, 300, 28);
		contentPane.add(statefield);
		
		cityfield = new JTextField();
		cityfield.setFont(new Font("Tahoma", Font.ITALIC, 22));
		cityfield.setColumns(10);
		cityfield.setBounds(157, 395, 300, 28);
		contentPane.add(cityfield);
		
		contactfield = new JTextField();
		contactfield.setFont(new Font("Tahoma", Font.ITALIC, 22));
		contactfield.setColumns(10);
		contactfield.setBounds(157, 431, 300, 28);
		contentPane.add(contactfield);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Accountantsection acv=new Accountantsection();
				acv.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		btnBack.setBounds(368, 502, 89, 25);
		contentPane.add(btnBack);
	}

}
