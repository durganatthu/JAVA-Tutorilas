package com.staticVariable;


public class SttaicVariMethod3 {
	
	private static int count= 0;
	private static String branch = "IT";
	private static int num = 10;
	private String name;
	private String city;

	SttaicVariMethod3(String n, String c){
		
		name = n;
		city = c;
		count++;
	}
	
	static void demo()
	{
		branch = branch.concat("add");
		System.out.println("hi");
	}
	
	void display()
	{
		branch = branch.concat("add");
		//System.out.println("Name: "+name+" City: "+city+" Count: "+count+" Branch: "+branch+" Number: "+num);
		
	}
	
	public static void main(String[] args) 
	{
			
		SttaicVariMethod3 obj1 = new SttaicVariMethod3("Name1","City1");
		//obj1.demo();
		obj1.display();
		SttaicVariMethod3 obj2 = new SttaicVariMethod3("Name2","City2");
		//obj2.demo();
		obj2.display();
		SttaicVariMethod3 obj3 = new SttaicVariMethod3("Name3","City3");
		//obj3.demo();
		obj3.display();
		SttaicVariMethod3.demo();
		
		

	}

}
