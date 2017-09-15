package com.Inheritance;

class Father
{
	public void fatherIdentity()
	{
		System.out.println("I am a Father.");
	}
}
class Son extends Father
{
	public void sonIdentity()
	{
		System.out.println("I am a Son.");
	}
}
class Daughter extends Father
{
	public void daughterIdentity()
	{
		System.out.println("I am a Daughter.");
	}
}
class HierarchicalInheritance
{
	public static void main(String args[])
	{
		Son s = new Son();
		s.sonIdentity();
		s.fatherIdentity();
		Daughter d = new Daughter();		
		d.daughterIdentity();
		d.fatherIdentity();
		// d.sonIdentity();==== error occure
	}
}

