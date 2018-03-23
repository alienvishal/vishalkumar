import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Addaccountant {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField1;
	private JTextField textField2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addaccountant window = new Addaccountant();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Addaccountant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		

		JLabel lblAddAccountant = new JLabel("ADD ACCOUNTANT");
		lblAddAccountant.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblAddAccountant.setForeground(Color.WHITE);
		lblAddAccountant.setBounds(108, 11, 237, 32);
		frame.getContentPane().add(lblAddAccountant);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(27, 90, 46, 14);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(174, 90, 194, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(27, 146, 67, 14);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblEmailid = new JLabel("EmailID");
		lblEmailid.setForeground(Color.WHITE);
		lblEmailid.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmailid.setBounds(27, 193, 67, 14);
		frame.getContentPane().add(lblEmailid);
		
		JLabel lblContactNumber = new JLabel("Contact Number");
		lblContactNumber.setForeground(Color.WHITE);
		lblContactNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContactNumber.setBounds(27, 256, 115, 14);
		frame.getContentPane().add(lblContactNumber);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBounds(174, 145, 194, 32);
		frame.getContentPane().add(passwordField);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField1.setColumns(10);
		textField1.setBounds(174, 193, 194, 32);
		frame.getContentPane().add(textField1);
		
		textField2 = new JTextField();
		textField2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField2.setColumns(10);
		textField2.setBounds(174, 248, 194, 32);
		frame.getContentPane().add(textField2);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name=textField.getText();
				char ch[]=passwordField.getPassword();
				String password=String.valueOf(ch);
				String emailID=textField1.getText();
				String contact=textField2.getText();
				if(textField.equals("") || passwordField.equals("") || textField1.equals("")||textField2.equals("")){
					JOptionPane.showMessageDialog(null, "Please Enter");
				}
				else{
				AccountGetterSetter a=new AccountGetterSetter(name,password,emailID,contact);
				int status=new AccountDataBase().save(a);
				
				if(status>0){
					JOptionPane.showMessageDialog(null, "Successfull Recored");
					textField.setText("");
					passwordField.setText("");
					textField1.setText("");
					textField2.setText("");
				}
				else{
					JOptionPane.showMessageDialog(null, "Sorry Unable to record");
				}
			}
			}
		});
		btnNewButton.setBounds(125, 316, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton1 = new JButton("BACK");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AdminSection();
				AdminSection.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton1.setBounds(284, 316, 89, 23);
		frame.getContentPane().add(btnNewButton1);
		frame.setBounds(100, 100, 480, 403);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
