package com.Final;

 final class FinBitwise {
	int id=10;
	String name;
	String address;
	
	public FinBitwise()
	{
		String name="bitwise";
		String address="pune";
		int id=5;
	}
	public void run()
	{
		System.out.println("run method");
	}
 
}
 class FinalClass
 {
	 public static void main(String[] args) {
		 FinBitwise b=new FinBitwise();
		 b.run();
		 
		
	}
 }
