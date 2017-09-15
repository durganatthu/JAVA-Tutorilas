package com.staticVariable;

// Instance method can accees the static and non-static variable .
//Instance method can called Static and instance method also.


 class SttaicVari{
     static int a=10;
     int b=22;
     public static void run()
     {
    	 System.out.println(a); 
     }
     public void run2()
     {
    	 System.out.println(a+b);
     }
     
     public static void run3()
     {
    	 System.out.println("static method");
    	 run();
     }
     public void run4()
     {
    	 System.out.println("instance method");
    	 run2();
    	 run3();
     }
 }
     class SttaicMethod2
     {
     public static void main(String[] args) {
    	 SttaicVari. run();
    	SttaicVari. run3();
    	 
    	 SttaicVari s1=new SttaicVari();
    	 s1.run2();
    	 s1.run4();
	}
     }
     
     
	


