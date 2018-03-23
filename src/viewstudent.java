import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class viewstudent {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewstudent window = new viewstudent();
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
	public viewstudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 846, 457);
		List<AddStudentGetterSetter> list=studentDatabase.view();
		int size=list.size();
		String data[][]=new String[size][11];
		int row=0;
		for(AddStudentGetterSetter a:list){
			data[row][0]=a.getName();
			data[row][1]=a.getEmail();
			data[row][2]=a.getCourse();
			data[row][3]=String.valueOf(a.getfees());
			data[row][4]=String.valueOf(a.getdue());
			data[row][5]=a.getAddress();
			data[row][6]=a.getCity();
			data[row][7]=a.getState();
			data[row][8]=a.getcontactno();
			data[row][9]=String.valueOf(a.getpaid());
			data[row][10]=String.valueOf(a.getid());
			row++;
		}
		
		String column[]={"Name","Email","Course","Fees","Due","Address","City","State","Contact No","Paid","Roll NO"};
		frame.getContentPane().setLayout(null);
		JTable jTable=new JTable(data,column);
		JScrollPane js=new JScrollPane(jTable);
		frame.getContentPane().add(js);
		js.setBounds(0, 0, 820, 407);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
