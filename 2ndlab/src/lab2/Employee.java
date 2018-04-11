package lab2;

public class Employee {
	private int id;
	private String firstName;
	private static int count;
	
	public int getCount() {
		return count;
	}
	
	private Date joiningDate;
	
	public Employee(String firstName, Date joiningDate) {
		this.firstName = firstName;
		this.joiningDate = joiningDate;
		++count;
		id = count;
	}
	
	public void display(){
		System.out.print("firstName"+ firstName+ "\t");
		System.out.println("Joining Date"+ joiningDate);
		System.out.println("Employee ID"+ id);
	}
	

}
