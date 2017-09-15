package com.DefaultConstructor;

public class ParameterisedConstructor {
	int id;
	String name ;
	int salary;
	public ParameterisedConstructor(int a, String b, int d) {
		
		id=a;
		name=b;
	    salary=d;
	System.out.println("parameteries constructor");
	}
	void display()
	{
		System.out.println("id : " + id + " " + "" + "name:" + name + " salary : " + salary);
		System.out.println("salary:"+salary);
	}

	public static void main(String[] args) {
		ParameterisedConstructor p1=new ParameterisedConstructor(1111, "durga",676767);
		ParameterisedConstructor p2=new ParameterisedConstructor(1234, "natthu",2345);
		
	
		p1.display();
		p2.display();
		
		

	}

}
