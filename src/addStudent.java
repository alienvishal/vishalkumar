import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class addStudent {

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
					addStudent window = new addStudent();
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
	public addStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 153, 153));
		frame.getContentPane().setLayout(null);
		
		JLabel lblAddStudent = new JLabel("Add Student");
		lblAddStudent.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblAddStudent.setBounds(210, 11, 172, 50);
		frame.getContentPane().add(lblAddStudent);
		
		JLabel lblName = new JLabel("NAME:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(10, 101, 63, 36);
		frame.getContentPane().add(lblName);
		
		JLabel label = new JLabel("EMAIL:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(10, 148, 63, 36);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("COURSE:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(10, 195, 82, 36);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("FEES:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(10, 242, 82, 36);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("PAID:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_3.setBounds(10, 289, 82, 36);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("DUE:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_4.setBounds(10, 336, 82, 36);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("ADDRESS:");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_5.setBounds(10, 383, 82, 36);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("CITY:");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_6.setBounds(10, 498, 82, 36);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("STATE:");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_7.setBounds(10, 545, 82, 36);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("CONTACT NO:");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_8.setBounds(10, 592, 108, 36);
		frame.getContentPane().add(label_8);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(220, 105, 273, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(220, 152, 273, 29);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(220, 199, 273, 29);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(220, 246, 273, 29);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(220, 293, 273, 29);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setColumns(10);
		textField_5.setBounds(220, 340, 273, 29);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setColumns(10);
		textField_6.setBounds(220, 502, 273, 29);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_7.setColumns(10);
		textField_7.setBounds(220, 549, 273, 29);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_8.setColumns(10);
		textField_8.setBounds(220, 596, 273, 29);
		frame.getContentPane().add(textField_8);
		
		final JTextArea textArea = new JTextArea();
		textArea.setColumns(10);
		textArea.setBounds(220, 391, 273, 85);
		frame.getContentPane().add(textArea);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int rollno=Integer.parseInt(textField_9.getText());
				String name=textField.getText();
				String email=textField_1.getText();
				String course=textField_2.getText();
				int fees=Integer.parseInt(textField_3.getText());
				int paid=Integer.parseInt(textField_4.getText());
				int due=Integer.parseInt(textField_5.getText());
				String Address=textArea.getText();
				String city=textField_6.getText();
				String state=textField_7.getText();
				String contactno=textField_8.getText();
				AddStudentGetterSetter a=new AddStudentGetterSetter(name,email,course,fees,due,Address,city,state,contactno,paid,rollno);
				int status=studentDatabase.save(a);
				if(status>0){
					JOptionPane.showMessageDialog(null, "ADD RECORED");
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
					textField_7.setText("");
					textField_8.setText("");
					textArea.setText("");
					textField_9.setText("");
				}
				else{
					JOptionPane.showMessageDialog(null, "ERROR");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textArea.setText("");
				textField_9.setText("");
			}
		}
		});
		btnAdd.setBounds(132, 682, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new viewAccount();
				viewAccount.main(new String[] {});
				frame.dispose();
			}
		});
		btnBack.setBounds(386, 682, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel lblId = new JLabel("ROLL NO:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblId.setBounds(10, 54, 82, 36);
		frame.getContentPane().add(lblId);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_9.setColumns(10);
		textField_9.setBounds(220, 61, 273, 29);
		frame.getContentPane().add(textField_9);
		
		frame.setBackground(new Color(102, 204, 102));
		frame.setBounds(100, 100, 594, 755);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
