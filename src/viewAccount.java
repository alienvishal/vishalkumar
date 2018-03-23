import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class viewAccount {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewAccount window = new viewAccount();
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
	public viewAccount() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("ProgressBar.selectionBackground"));
		frame.setBounds(100, 100, 455, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAccountantSection = new JLabel("Accountant Section");
		lblAccountantSection.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblAccountantSection.setBounds(86, 23, 273, 50);
		frame.getContentPane().add(lblAccountantSection);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new addStudent();
				addStudent.main(new String[] {});
				frame.dispose();
			}
		});
		btnAddStudent.setBounds(10, 99, 150, 50);
		frame.getContentPane().add(btnAddStudent);
		
		JButton btnViewAccountant = new JButton("View Student");
		btnViewAccountant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new viewstudent();
				viewstudent.main(new String[] {});
				frame.dispose();
			}
		});
		btnViewAccountant.setBounds(268, 99, 156, 50);
		frame.getContentPane().add(btnViewAccountant);
		
		JButton btnEditStudent = new JButton("Edit Student");
		btnEditStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new editStudent();
				editStudent.main(new String[] {});
				frame.dispose();
			}
		});
		btnEditStudent.setBounds(10, 174, 150, 50);
		frame.getContentPane().add(btnEditStudent);
		
		JButton btnDueFees=new JButton("Due Fees");
		btnDueFees.setBounds(268,174,156,50);
		frame.getContentPane().add(btnDueFees);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBounds(145, 254, 131, 50);
		frame.getContentPane().add(btnLogout);
	}
}
