package com.InnerOuterclass;




class Outer
{	
	class Inner
	{
		public void display()
		{
			System.out.println("I am a inner class.");
		}
		public void run2()
		{
			System.out.println("hello");
		}
	}
	public void show()
	{
		Inner i = new Inner();
		i.display();
	}
}
public class OuterInnerClass
{
	public static void main(String args[])
	{
		Outer o = new Outer();
		o.show();
		Outer.Inner i = new Outer().new Inner();
		i.display();	
		i.run2();
	
	}
}
