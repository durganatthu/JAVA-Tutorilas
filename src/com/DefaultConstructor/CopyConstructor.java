package com.DefaultConstructor;

public class CopyConstructor {
	int id;
	String name;
	public CopyConstructor( int a, String b) {
		id=a;
		name=b;
		System.out.println("copy Constructor");
		}
	
	public CopyConstructor(CopyConstructor c5)
	{
		id=c5.id;
		name=c5.name;
	}
	void display()
	{
		System.out.println("id:"+id+"name:"+name);
	}
	
	
	public static void main(String[] args) {
		
		CopyConstructor c=new CopyConstructor(122, "pinki");
		CopyConstructor c2=new CopyConstructor(122, "pinki");
		CopyConstructor c3=new CopyConstructor(c);
		c.display();
		c2.display();
		c3.display();
		
	}
	

}
