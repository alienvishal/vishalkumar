import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class editStudent {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					editStudent window = new editStudent();
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
	public editStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 485, 746);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEditRecord = new JLabel("Edit Record");
		lblEditRecord.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblEditRecord.setBounds(135, 11, 171, 32);
		frame.getContentPane().add(lblEditRecord);
		
		JLabel lblRollNo = new JLabel("Roll NO:");
		lblRollNo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRollNo.setBounds(10, 59, 61, 14);
		frame.getContentPane().add(lblRollNo);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(135, 54, 210, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 131, 61, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("Email Id:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(10, 176, 75, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Course:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(10, 223, 61, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Fees:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(10, 268, 61, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Due:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_3.setBounds(10, 317, 61, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Address:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_4.setBounds(10, 369, 75, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("City:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_5.setBounds(10, 475, 61, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("State:");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_6.setBounds(10, 520, 61, 14);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("Contact No:");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_7.setBounds(10, 565, 89, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("Paid:");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_8.setBounds(10, 612, 61, 14);
		frame.getContentPane().add(label_8);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(135, 115, 210, 32);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setBounds(135, 158, 210, 32);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setBounds(135, 205, 210, 32);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setBounds(135, 250, 210, 32);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(135, 299, 210, 32);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(135, 457, 210, 32);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(135, 502, 210, 32);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(135, 547, 210, 32);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_9.setBounds(135, 594, 210, 32);
		frame.getContentPane().add(textField_9);
		
		final JTextArea textArea = new JTextArea();
		textArea.setColumns(5);
		textArea.setBounds(135, 366, 210, 62);
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().add(textArea);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 95, 449, 546);
		frame.getContentPane().add(separator);
		
		JButton btnUpdateStudent = new JButton("UPDATE STUDENT");
		btnUpdateStudent.setBounds(56, 673, 141, 23);
		frame.getContentPane().add(btnUpdateStudent);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setBounds(302, 673, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnLoad = new JButton("LOAD");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int rollno=Integer.parseInt(textField.getText());
				AddStudentGetterSetter a=new studentDatabase().searchByRollNo(rollno);
				textField_1.setText(a.getName());
				textField_2.setText(a.getEmail());
				textField_3.setText(a.getCourse());
				textField_4.setText(String.valueOf(a.getfees()));
				textField_5.setText(String.valueOf(a.getdue()));
				textArea.setText(a.getAddress());
				textField_6.setText(a.getCity());
				textField_7.setText(a.getState());
				textField_8.setText(a.getcontactno());
				textField_9.setText(String.valueOf(a.getpaid()));
				
				
			}
		});
		btnLoad.setBounds(370, 57, 89, 23);
		frame.getContentPane().add(btnLoad);
	}
}
