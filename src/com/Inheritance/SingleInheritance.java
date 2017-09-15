package com.Inheritance;

 class SingleInheritance1 {
	
	public void show()
	{
		System.out.println("parent method");
	}
	public void display()
	{
		System.out.println("parent method 2");
	}
 }
	class ChildClass extends SingleInheritance1
	{
		public void durga()
		{
			System.out.println("child class method");
		}
		public void m2()
		{
			System.out.println("child class method 2");
		}
	}
	class SingleInheritance
	{
	public static void main(String[] args) {
		SingleInheritance s= new SingleInheritance();
		ChildClass c=new ChildClass();
		c.display();
		c.show();
		c.durga();
		c.m2();
		
		
	}

}
