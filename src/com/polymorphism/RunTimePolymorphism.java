package com.polymorphism;

class Demo
{
	public void show()
	{
	System.out.println("base class method is executed");	

	}
}

public class RunTimePolymorphism extends Demo{

	public void show()
	{
		System.out.println("main methos is executed ");
	}
public static void main(String[] args) {
	
	Demo m=new Demo();
	m.show();
	RunTimePolymorphism r= new RunTimePolymorphism();
	r.show();
	
}
}
