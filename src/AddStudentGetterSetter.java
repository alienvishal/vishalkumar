
public class AddStudentGetterSetter {

	private String name,Email,course,Address,city,state,contactno;
	private int fees,due,paid,id;
	public AddStudentGetterSetter(){}
	public AddStudentGetterSetter(String name,String Email,String course,int fees,int due,String Address,String city,String state,String contactno,int paid,int id){
		this.id=id;
		this.name=name;
		this.Email=Email;
		this.course=course;
		this.fees=fees;
		this.due=due;
		this.Address=Address;
		this.city=city;
		this.state=state;
		this.contactno=contactno;
		this.paid=paid;
	}
	
	
	public void setid(int id){
		this.id=id;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public void setEmail(String Email){
		this.Email=Email;
	}
	public void setCourse(String course){
		this.course=course;
	}
	public void setfees(int fees){
		this.fees=fees;
	}
	public void setdue(int due){
		this.due=due;
	}
	public void setAddress(String Address){
		this.Address=Address;
	}
	public void setCity(String city){
		this.city=city;
	}
	public void setState(String state){
		this.state=state;
	}
	public void setcontactno(String contactno){
		this.contactno=contactno;
	}
	
	public void setPaid(int paid){
		this.paid=paid;
	}
	
	public String getName(){
		return name;
	}
	public String getEmail(){
		return Email;
	}
	public String getCourse(){
		return course;
	}
	public int getfees(){
		return fees;
	}
	public int getdue(){
		return due;
	}
	public String getAddress(){
		return Address;
	}
	public String getCity(){
		return city;
	}
	public String getState(){
		return state;
	}
	public String getcontactno(){
		return contactno;
	}
	
	public int getpaid(){
		return paid;
	}
	
	public int getid(){
		return id;
	}
}
