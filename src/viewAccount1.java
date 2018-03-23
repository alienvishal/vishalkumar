import java.awt.EventQueue;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class viewAccount1 {

	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewAccount1 window = new viewAccount1();
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
	public viewAccount1() {
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		
		List<AccountGetterSetter> list=AccountDataBase.arraylist();
		int size=list.size();
		String data[][]=new String[size][4];
		int row=0;
		for(AccountGetterSetter a:list){
			data[row][0]=a.getName();
			data[row][1]=a.getPassword();
			data[row][2]=a.getEmailid();
			data[row][3]=a.getContactNo();
			row++;
		}
		
		String columnName[]={"Name","Password","EmailAddress","Contact No"};
		frame.getContentPane().setLayout(null);
		JTable jTable=new JTable(data,columnName);
		JScrollPane jScrollPane=new JScrollPane(jTable);
		jScrollPane.setBounds(0, 0, 784, 361);
		frame.getContentPane().add(jScrollPane);
		
		JButton btnNewButton = new JButton("back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new AdminSection();
				AdminSection.main(new String[] {});
				frame.dispose();
			}
		});
		jScrollPane.setRowHeaderView(btnNewButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 400);
		
	}
}
