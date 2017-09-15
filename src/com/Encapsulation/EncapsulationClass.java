package com.Encapsulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EncapsulationClass {

	
	
    
    
	private int id;
	private String name;
    private String uname;
    private int pwd;
    
    public void setId(int id)
    {
    	this.id=id;
    }
    public int getId()
    {
    	return id;
    }
    
    public void setName(String name)
    {
    	this.name=name;
    	
    }
    public String getName()
    {
    	return name;
    }
    public void setUname(String uname)
    {
    	this.name=uname;
    }
    public String getUname()
    {
    	return uname;
    }
     
    public void setPwd(int pwd)
    {
    	this.pwd=pwd;
    }
    public int getPwd()
    {
    	return pwd;
    }
    
   public static void main(String[] args) throws IOException {

	         InputStreamReader isr = new InputStreamReader(System.in);
	         BufferedReader br = new BufferedReader(isr);
	         System.out.println("What is Your Name ?");
	         
	         String name = br.readLine(); // take a string as input from keyboard
	         System.out.print("What is YourGender ( M/F ) ?");
	         
	         char gender = (char)br.read(); // take a character as input
	         System.out.print("Do you like Java ( Y/N ) ?");
	         char like_java = (char)System.in.read(); // another way to read a char
	         System.out.println("Hello " + name);
	         System.out.println("Gender : " + gender);
	         System.out.println("Like Java : " + like_java);
	      
	
	   EncapsulationClass e1=new EncapsulationClass();
	   Scanner s = new Scanner (System.in);
	    System.out.println("Enter the username:");
	    String name1=s.next();
	    System.out.println("enter the password");
	    int id=s.nextInt();
	   e1.setId(123);
	   e1.setName("bitwise");
	   e1.setUname("Bitcoin");
	   e1.setPwd(123);
	   System.out.println("setId:"+e1.getId());
	   System.out.println("setName:"+e1.getName());
	   System.out.println("e1.setUname:"+e1.getUname());
	   System.out.println("setPwd:"+e1.getPwd());
	   
	   
}
}
