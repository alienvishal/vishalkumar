import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class FeeReport {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeeReport window = new FeeReport();
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
	public FeeReport() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFeeReport = new JLabel("Fee Report");
		lblFeeReport.setBackground(Color.LIGHT_GRAY);
		lblFeeReport.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblFeeReport.setBounds(141, 11, 170, 43);
		frame.getContentPane().add(lblFeeReport);
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AdminLogin();
				AdminLogin.main(new String[] {});
				frame.dispose();
			}
		});
		
		
		btnAdminLogin.setBounds(151, 95, 128, 52);
		frame.getContentPane().add(btnAdminLogin);
		
		JButton btnAccountLogin = new JButton("Account Login");
		btnAccountLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AccountantLogin();
				AccountantLogin.main(new String[] {});
				frame.dispose();
			}
		});
		btnAccountLogin.setBounds(151, 168, 128, 52);
		frame.getContentPane().add(btnAccountLogin);
	}

}
