package com.thiskeyword;

// to Call Instance method using "This Keyword"

public class A {
	
	public void show()   // instance method
	{
		System.out.println("welcome to Instance method");
	}
	
	void display()
	{
	
		System.out.println("we call the show method using this keyword");
		this.show();   // using this keyword we can call show method
	}
	public static void main(String[] args) {
		
		A a=new A();
		a.display();
	}
	
	
	

}
