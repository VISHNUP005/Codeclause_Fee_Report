package feeproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Studentlist extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Studentlist frame = new Studentlist();
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
	public Studentlist() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 531);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student List");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 28));
		lblNewLabel.setBounds(22, 11, 310, 55);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 120, 522, 337);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name", "Email", "Course", "Fee", "Paid", "Due"
			}
		));
		
		JButton loadbtn = new JButton("Load");
		loadbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MySqlConnection sqlc=new MySqlConnection();
				
				

				Connection con=sqlc.getConnection();
				try {
					Statement stmt=con.createStatement();

					PreparedStatement st = con.prepareStatement("select * from studentfee");
					ResultSet r1 = st.executeQuery();
					while(r1.next()) {
						int Id=r1.getInt("id");
						String id=Integer.toString(Id);
						String name=r1.getString("name");
						String email=r1.getString("email");
						String course=r1.getString("course");
						String fee=r1.getString("fee");
						String paid=r1.getString("paid");
						String due=r1.getString("due");
						String data[]= {id,name,email,course,fee,paid,due};
						DefaultTableModel model=(DefaultTableModel)table.getModel();
						model.addRow(data);
						
					}
					
					
					
					
				}
				catch(SQLException e1) {
					System.out.println(e1);
				}
				
				
			}
		});
		loadbtn.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		loadbtn.setBackground(Color.GRAY);
		loadbtn.setBounds(337, 86, 89, 23);
		contentPane.add(loadbtn);
		
		JButton backbtn = new JButton("Back");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Accountantsection asc=new Accountantsection();
				asc.setVisible(true);
			}
		});
		backbtn.setFont(new Font("Times New Roman", Font.ITALIC, 21));
		backbtn.setBackground(Color.GRAY);
		backbtn.setBounds(464, 86, 89, 23);
		contentPane.add(backbtn);
		
		JLabel lblNewLabel_1 = new JLabel("_______________________________________________________________________________");
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setBounds(22, 52, 557, 23);
		contentPane.add(lblNewLabel_1);
	}
}
