package com.cg;

public class Lab2 {
	private int id;
	private String firstName;
	private static int count;
	
	public int getCount() {
		return count;
	}
	
	private Lab2Date joiningDate;
	
	public Lab2(String firstName, Lab2Date joiningDate) {
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