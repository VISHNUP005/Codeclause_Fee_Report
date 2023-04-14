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

public class AdminAccdelete extends JFrame {

	private JPanel contentPane;
	private JTextField idfield;
	JLabel deletelbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminAccdelete frame = new AdminAccdelete();
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
	public AdminAccdelete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 483);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the Accountant Id:-");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 19));
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBounds(38, 86, 201, 55);
		contentPane.add(lblNewLabel);
		
		idfield = new JTextField();
		idfield.setFont(new Font("Times New Roman", Font.BOLD, 20));
		idfield.setBounds(257, 96, 171, 39);
		contentPane.add(idfield);
		idfield.setColumns(10);
		
		JButton deletebtn = new JButton("Delete");
		deletebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id1=Integer.parseInt(idfield.getText());
				int id2=0;
				MySqlConnection sqlc=new MySqlConnection();
				Connection con=sqlc.getConnection();
				try {
					PreparedStatement st = con.prepareStatement("select id from Accountant");
					ResultSet r1 = st.executeQuery();
					
					while(r1.next()) {
						id2=r1.getInt("id");
						if(id1==id2) {
							Statement stmt=con.createStatement();
							stmt.executeUpdate("Delete from Accountant where id='"+id1+"'");
							System.out.println("Successfull !!");
							deletelbl.setText("Accountant Delete Successfull!!");
							break;
							
							
						}
						
						
		
					}
					
					
				}
				
				catch(SQLException e1) {
					System.out.println(e1);
				}
				if(id2==0) {
					deletelbl.setText("Accountant not Found!!");
				}
				
				
				
				
			}
		});
		deletebtn.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		deletebtn.setBounds(70, 198, 89, 23);
		contentPane.add(deletebtn);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adminsection adm=new Adminsection();
				adm.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		btnBack.setBounds(373, 200, 89, 23);
		contentPane.add(btnBack);
		
		 deletelbl = new JLabel("");
		deletelbl.setFont(new Font("Tempus Sans ITC", Font.ITALIC, 21));
		deletelbl.setForeground(Color.RED);
		deletelbl.setBounds(105, 302, 392, 39);
		contentPane.add(deletelbl);
	}
}
