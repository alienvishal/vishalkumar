
public class AccountGetterSetter {
	private String name,password,emailId,contactno;
	public AccountGetterSetter(){}
	public AccountGetterSetter(String name,String password,String emailId,String contactno){
		super();
		this.name=name;
		this.password=password;
		this.emailId=emailId;
		this.contactno=contactno;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public void setEmailid(String emailid){
		this.emailId=emailid;
	}
	public void setContactNo(String contactno){
		this.contactno=contactno;
	}
	
	public String getName(){
		return name;
	}
	
	public String getPassword(){
		return password;
	}
	
	public String getEmailid(){
		return emailId;
	}
	
	public String getContactNo(){
		return contactno;
	}
	

}
