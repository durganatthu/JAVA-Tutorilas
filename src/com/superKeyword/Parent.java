package com.superKeyword;
// when both parent class and child class variable are same then we are using the super keyword

public class Parent {
	int id=123;
	String name="bitwise";
	String address="pune";
	public void run()
	{
		System.out.println("hi");
	}
}
class child extends Parent
{
	int id=1234;
	String name="bitwiseeee";
	String address="mumbai";
	public void demo()
	{
		System.out.println("id:"+super.id);
		System.out.println("name:"+super.name);
		System.out.println("address:"+super.address);
		
	}
	public static void main(String[] args) {
		child c=new child();
		c.demo();
		System.out.println("the methos is executed of child class");
		Parent p=new Parent();
		p.run();
		System.out.println("parent class method is executed");
		c.demo();
	}
}
