package com.cg;

public class console 
{
	    public static void main(String[] args)
		{

	    	 Date doj  = new Date(11,12,2013); 
	    	 Employee emp = new Employee("Raj","Ghosh",75000,"a5", doj);
	    	 emp.displayentry();
	    	 doj.displayDate();
	     	
	         doj  = new Date(9,6,2013);
	    	 emp = new Employee("John","Cena",65000,"a5",doj);	    
	         emp.displayentry();	
	         doj.displayDate();
	         
	         doj  = new Date(8,5,2011);
	    	 emp = new Employee("Simran","Setia",85000,"a3",doj);	    
	         emp.displayentry();	
	         doj.displayDate();
	         
	         doj  = new Date(7,6,2014);
	    	 emp =  new Employee("Dev","Bose",3000,"a2",doj);
	    	 emp.displayentry();
	    	 doj.displayDate();
	    	 
	 	     doj  = new Date(12,12,2016);
	    	 emp = new Employee("Jimmy","Singh",700,"b5",doj);
	 		 emp.displayentry();	
	 		 doj.displayDate();
	 		 
	    emp.displaycount();
	   }
	}

