package com.MethodOverriding;
// method overriding
class  Demo
{
	public void run()
	{
		System.out.println("welccome to first run method");
	}
}
public class Overriding extends Demo{
	
	public void run()
	{
		System.out.println("welcome to run method");
	}
public static void main(String[] args) {
	Overriding r =new Overriding();
	r.run();
	}
}