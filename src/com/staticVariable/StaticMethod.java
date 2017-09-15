package com.staticVariable;
// Sttaic method Example
public class StaticMethod {
	
	public static int add(int n1, int n2)
	{
		return n1+n2;
	}
	public static int sub(int n1, int n2)
	{
		return n1-n2;
	}
	public static void main(String[] args) {
		
		//StaticExample s=new StaticExample(0, null);
		StaticMethod m=new StaticMethod();
		System.out.println("addirtion:"+StaticMethod.add(12,10));
		System.out.println("substraction:"+StaticMethod.sub(1, 4));
	}

}
