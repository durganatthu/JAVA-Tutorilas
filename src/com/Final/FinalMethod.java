package com.Final;

class XYZ{  
   final void demo(){
      System.out.println("XYZ Class Method");
   }  
}  
	     
class FinalMethod extends XYZ{  
   public static void main(String args[]){  
	   FinalMethod obj= new FinalMethod();  
      obj.demo();  
   }  
}