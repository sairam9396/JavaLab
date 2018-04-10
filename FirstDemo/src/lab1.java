class Employee{
	
	private String f_name;
	private String s_name;
	private int sal;
	private String grade;
	private String JoMo;
	public static int empid;
	public static int ecount;
	
	// Default constructor
	
	public Employee(){
		System.out.println("inside default constructor");
		f_name = "NA";
		s_name = "NA";
		sal = 1000;
		grade = "NA";
		date = 00/0000;
	}
	
	// parameterized constructor
	
	public Employee(String f_name, String l_name, double sal, String grade, String JoMo){
		System.out.println("inside parameterized constructor");
		this.f_name = fname;
		this.s_name = sname;
		this.sal = sal;
		this.grade = grade;
		this.date = date;
		this ecount = ++ecount;
	}
	
	public void displayentry(){
		System.out.print.ln("*************************************************************************");
		System.out.print.ln("Employee ID: empid");
		System.out.print.ln("First Name: +f_name");
		System.out.print.ln("Last Name: +l_name");
		System.out.print.ln("Salary: +sal");
		System.out.print.ln("Grade: +grade");
		System.out.print.ln("Month of joining: +JoMo");
		System.out.print.ln("*************************************************************************");
	}	
	
	public void displaycount(){
		System.out.print.ln("Total number of employees is: +ecount");
	}
	
}
	
	