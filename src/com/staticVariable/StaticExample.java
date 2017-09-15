package com.staticVariable;
// static variable Example
public class StaticExample {  
	   int rollno;  
	   String name;  
	   static String college ="ITS";   // college name is the common properties fore lla
	     
	   StaticExample(int r,String n){  
	   rollno = r;  
	   name = n;  
	   }  
	 void display (){System.out.println(rollno+" "+name+" "+college);}  
	  
	 public static void main(String args[]){  
		 StaticExample  s1 = new StaticExample (111,"Karan");  
		 StaticExample s2 = new StaticExample (222,"Aryan");  
	   
	 s1.display();  
	 s2.display();  
	 }  
	}  