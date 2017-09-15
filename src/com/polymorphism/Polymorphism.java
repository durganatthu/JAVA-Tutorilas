package com.polymorphism;
// Compile time polymorphism is nothing but the method Overloading

class pply
{
	public void run()
	{
		System.out.println("base class method");
	}
}
public class Polymorphism{
	
	public void run()
	{
		System.out.println("method is  executed Compiletime polymorphism");
	}
	public static void main(String[] args) {
		pply p=new pply();
		p.run();
		Polymorphism p1=new Polymorphism();
		p1.run();
	}

}

