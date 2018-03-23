import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class AccountDataBase {
	
	public static Connection Initialization(){
		Connection con=null;
			
		try{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fee","root","root");
			}catch(Exception e){
				System.out.println(e);
			}
		return con;
	}
	
	
	
	public int save(AccountGetterSetter a){
		int status=0;
		try{
			Connection con=Initialization();
			PreparedStatement prepare=con.prepareStatement("insert into addaccount (name,password,emailId,contactno) values(?,?,?,?)");
			prepare.setString(1, a.getName());
			prepare.setString(2, a.getPassword());
			prepare.setString(3, a.getEmailid());
			prepare.setString(4, a.getContactNo());
			status=prepare.executeUpdate();
			if(status>0){
				System.out.println("SUCCESSFULL");
			}
		}catch(Exception e){System.out.println(e);}
		
		return status;
		
	}
	
	public static List<AccountGetterSetter> arraylist(){
		ArrayList<AccountGetterSetter> list=new ArrayList<>();
		try{
			Connection con=Initialization();
			PreparedStatement preparedStatement=con.prepareStatement("select * from addaccount");
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				AccountGetterSetter a=new AccountGetterSetter();
				a.setName(resultSet.getString(1));
				a.setPassword(resultSet.getString(2));
				a.setEmailid(resultSet.getString(3));
				a.setContactNo(resultSet.getString(4));
				list.add(a);
			}
			con.close();
		}catch(Exception e){System.out.print(e);}
		return list;
	}
	
}
