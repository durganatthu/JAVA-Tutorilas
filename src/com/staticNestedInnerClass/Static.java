package com.staticNestedInnerClass;

import com.natthu.Papa;

 class Priya
{
	static class Durga
	{
		public void run()
		{
			System.out.println("welcome mummy");
		}
	}
	public void natthu()
	{
		System.out.println("welcome papa");
	}
}

public class Static {
	public static void main(String[] args) {
		Priya p=new Priya();
		p.natthu();
	    Priya.Durga d= new Priya.Durga();
	    d.run();
	    System.out.println("inner class will be executed ");
	    Papa p1=new Papa();
	    p1.run1();
	    System.out.println("run1 method is executed about papa class ");
	    
		
		
	}

}
