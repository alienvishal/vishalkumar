import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class AdminSection {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSection window = new AdminSection();
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
	public AdminSection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setBackground(Color.BLUE);
		frame.getContentPane().setLayout(null);
		
		JLabel jlabel=new JLabel("ADMIN SECTION");
		jlabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		jlabel.setForeground(new Color(240, 248, 255));
		jlabel.setBounds(104, 11, 239, 47);
		frame.getContentPane().add(jlabel);
		
		JButton btnViewAccountant = new JButton("View Accountant");
		btnViewAccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new viewAccount1();
				viewAccount1.main(new String[] {});
				frame.dispose();
			}
		});
		btnViewAccountant.setBounds(137, 155, 136, 47);
		frame.getContentPane().add(btnViewAccountant);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new FeeReport();
				FeeReport.main(new String[] {});
				frame.dispose();
			}
		});
		btnLogout.setBounds(137, 227, 136, 47);
		frame.getContentPane().add(btnLogout);
		
		JButton button = new JButton("Add Accountant");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Addaccountant();
				Addaccountant.main(new String[] {});
				frame.dispose();
			}
		});
		button.setBounds(137, 83, 136, 47);
		frame.getContentPane().add(button);
		frame.setBounds(100, 100, 451, 347);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
