package com.cg;

public class Lab2Date {
	private int day;
	private int month;
	private int year;

	
public Lab2Date(int day,int month,int year){
	this.day = day;
	this.month = month;
	this.year = year;
}

public String getdateinformat(){
	String dateinformat =  day + "/"+ month + "/"+ year;
	return dateinformat;
}


@Override
public String toString() {
	return getdateinformat();
}


}



