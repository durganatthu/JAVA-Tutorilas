/*package com.Encapsulation;

	 class Encapsulate{
	    private int ssn;
	    private String empName;
	    private int empAge;

	    //Getter and Setter methods
	    public int getEmpSSN(){
	        return ssn;
	    }

	    public String getEmpName(){
	        return empName;
	    }

	    public int getEmpAge(){
	        return empAge;
	    }

	    public void setEmpAge(int newValue){
	        empAge = newValue;
	    }

	    public void setEmpName(String newValue){
	        empName = newValue;
	    }

	    public void setEmpSSN(int newValue){
	        ssn = newValue;
	    }
	}
	public class EncapsulationDemo{
	    public static void main(String args[]){
	    	Encapsulate obj = new Encapsulate();
	         obj.setEmpName("Bitwise");
	         obj.setEmpAge(32);
	         obj.setEmpSSN(123);
	         System.out.println("Employee Name: " + obj.getEmpName());
	         System.out.println("Employee SSN: " + obj.getEmpSSN());
	         System.out.println("Employee Age: " + obj.getEmpAge());
	    } 
	}

*/
package com.Encapsulation;

	 class Encapsulate
	 {
		 private int empId;
		 private String empName;
		 private int empAge;
		 
		 public void setEmpId(int empId) {
				this.empId = empId;
			}
		public int getEmpId() {
			return empId;
		}
		
		 
		
		public void setEmpName(String empName)
		{ 
			this.empName=empName;
			
		}
		public String getEmpName()
		{
			return empName;
		}
		
		
		public void setEmpAge( int empAge)
		{
			this.empAge=empAge;
		}
		
		public int getEmpAge()
		{
			return empAge;
		}
		
	 }
	 class EncapsulationDemo
	 {
		 public static void main(String[] args) {
			 Encapsulate e=new Encapsulate();
			 e.setEmpId(123);
			 e.setEmpName("bitwise");
			 e.setEmpAge(1);
			 System.out.println("EmpId:"+e.getEmpId());
			 System.out.println("Empname:"+e.getEmpName());
			 System.out.println("EmpAge:"+e.getEmpAge());
			 
			
		}
		 
		
	 }