import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class studentDatabase {
	public static Connection init(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fee","root","root");
		}catch(Exception e){
			System.out.println(e);
		}
		return con;
	}
	
	public static int save(AddStudentGetterSetter a){
		int status=0;
		try{
			Connection con=init();
			PreparedStatement prepare=con.prepareStatement("insert into student (name,email,course,fees,due,address,city,state,contactno,paid,rollno) values(?,?,?,?,?,?,?,?,?,?,?)");
			prepare.setString(1, a.getName());
			prepare.setString(2, a.getEmail());
			prepare.setString(3, a.getCourse());
			prepare.setInt(4, a.getfees());
			prepare.setInt(5, a.getdue());
			prepare.setString(6, a.getAddress());
			prepare.setString(7, a.getCity());
			prepare.setString(8, a.getState());
			prepare.setString(9,a.getcontactno());
			prepare.setInt(10, a.getpaid());
			prepare.setInt(11, a.getid());
			status=prepare.executeUpdate();
			if(status>0){
				System.out.println("SUCCESSFULL");
			}
		}catch(Exception e){System.out.println(e);}
		
		return status;
		
	}
	
	public static List<AddStudentGetterSetter> view(){
		ArrayList<AddStudentGetterSetter> list=new ArrayList<>();
			try{
				Connection con=init();
				PreparedStatement ps=con.prepareStatement("select * from student");
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					AddStudentGetterSetter a=new AddStudentGetterSetter();
					a.setName(rs.getString(1));
					a.setEmail(rs.getString(2));
					a.setCourse(rs.getString(3));
					a.setfees(rs.getInt(4));
					a.setdue(rs.getInt(5));
					a.setAddress(rs.getString(6));
					a.setCity(rs.getString(7));
					a.setState(rs.getString(8));
					a.setcontactno(rs.getString(9));
					a.setPaid(rs.getInt(10));
					a.setid(rs.getInt(11));
					list.add(a);
				}
				con.close();
			}catch(Exception e){System.out.println(e);}
		
		return list;
		
	}
	
	public  AddStudentGetterSetter searchByRollNo(int rollno){
		AddStudentGetterSetter a=new AddStudentGetterSetter();
		try{
			Connection con=init();
			PreparedStatement ps=con.prepareStatement("select * from student where rollno=?");
			ps.setInt(1, rollno);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				a.setid(rs.getInt("rollno"));
				a.setName(rs.getString("name"));
				a.setEmail(rs.getString("email"));
				a.setCourse(rs.getString("course"));
				a.setfees(rs.getInt("fees"));
				a.setdue(rs.getInt("due"));
				a.setAddress(rs.getString("address"));
				a.setCity(rs.getString("city"));
				a.setState(rs.getString("state"));
				a.setcontactno(rs.getString("contactno"));
				a.setPaid(rs.getInt("paid"));
				
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		
		
		return a;
	}
	

}
