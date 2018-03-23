import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class AdminLogin {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin window = new AdminLogin();
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
	public AdminLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 509, 356);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248,148,6));
		panel.setBounds(0, 0, 493, 55);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Login\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(10, 11, 118, 33);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(44,62,80));
		panel1.setBounds(0, 53, 493, 268);
		frame.getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JLabel lblUsername = new JLabel("UserName:");
		lblUsername.setForeground(new Color(236,240,241));
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsername.setBounds(27, 54, 78, 24);
		panel1.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(236, 240, 241));
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(27, 122, 78, 24);
		panel1.add(lblPassword);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(115, 58, 188, 29);
		panel1.add(textField);
		textField.setColumns(10);
		textField.setBackground(new Color(108, 122, 137));
		
		passwordField = new JPasswordField();
		passwordField.setBounds(115, 122, 188, 29);
		panel1.add(passwordField);
		passwordField.setColumns(10);
		passwordField.setBackground(new Color(108, 122, 137));
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String textFeild1=textField.getText();
				char ch[]=passwordField.getPassword();
				String password=String.valueOf(ch);
				if(textFeild1.equals("Admin") && password.equals("123")){
					new AdminSection();
					AdminSection.main(new String[]{});
					frame.dispose();
				}
				else{
					JOptionPane.showMessageDialog(null, "Invaild UserName or Password !!!");
					textField.setText("");
					passwordField.setText("");
				}
			}
		});
		btnNewButton.setBounds(100, 197, 89, 23);
		panel1.add(btnNewButton);
		btnNewButton.setBackground(new Color(242, 38, 19));
		
		JButton btnNewButton1 = new JButton("Reset");
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				passwordField.setText("");
			}
		});
		btnNewButton1.setBounds(227, 197, 89, 23);
		panel1.add(btnNewButton1);
		btnNewButton1.setBackground(new Color(192, 57, 43));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
