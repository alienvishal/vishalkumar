import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class AccountDatabase1 {
	public static Connection init(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fee","root","root");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	
	public static boolean validate(String name,String password){
		boolean status=false;
		try{
			Connection con=init();
			PreparedStatement ps=con.prepareStatement("select * from addaccount where name=? and password=?");
			ps.setString(1,name);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		
		
		return status;
	}
 

}
