package com.Inheritance;
// MultiLevell Inheritance REX
class Test
{
	public void m1()
	{
		System.out.println("welcome to m1 method");
	}
}
class Demo extends Test
{
	public void m2()
	
	{
		System.out.println("welcome to m2 method");
	}
}
class Display extends Demo
{
	public void m3()
	{
		System.out.println("welcome to  m3 method");
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		
		Test t= new Test();
		Display s= new Display();
		s.m1();
		s.m2();
		s.m3();
	}

}
