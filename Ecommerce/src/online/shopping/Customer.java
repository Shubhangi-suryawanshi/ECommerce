package online.shopping;

public class Customer {
	private int id;
	private String Fname;
	private String Lname;
	private String address;
	private int contactNo;
	Customer()
	{
	
	}
	Customer(int id,String Fname,String Lname,String address,int contactNo)
	{
		this.id=id;
		this.Fname=Fname;
		this.Lname=Lname;
		this.address=address;
	}
     void showdata()
     {
    	 System.out.println("Customer Id"+id);
    	 System.out.println("customer name"+Fname);
    	 System.out.println("last name"+Lname);
    	 System.out.println("customer Address"+address);
    	 System.out.println("contact No."+contactNo);
     }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
     
}
