package feeproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Accountantview extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accountantview frame = new Accountantview();
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
	public Accountantview() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 548);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ACCOUNTANTS");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 29));
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setBounds(21, 23, 229, 64);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 139, 563, 345);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "NAME", "EMAIL", "PASSWORD", "CONTACT"
			}
		));
		
		JButton btnNewButton = new JButton("LOAD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/////////NEW BTN
				MySqlConnection sqlc=new MySqlConnection();
				
				

					Connection con=sqlc.getConnection();
					try {
						Statement stmt=con.createStatement();

						PreparedStatement st = con.prepareStatement("select * from Accountant");
						ResultSet r1 = st.executeQuery();
						while(r1.next()) {
							int Id=r1.getInt("id");
							String id=Integer.toString(Id);
							String name=r1.getString("name");
							String email=r1.getString("email");
							String password=r1.getString("password");
							String contact=r1.getString("contact");
							String data[]= {id,name,email,password,contact};
							DefaultTableModel model=(DefaultTableModel)table.getModel();
							model.addRow(data);
							
						}
						
						
						
						
					}
					catch(SQLException e1) {
						System.out.println(e1);
					}
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBounds(466, 102, 105, 26);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Adminsection ad=new Adminsection();
				ad.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnBack.setBounds(31, 98, 105, 26);
		contentPane.add(btnBack);
	}
}
