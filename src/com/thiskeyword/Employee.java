package com.thiskeyword;

 class Employee {
	int id;
	String name;
	String salary;
	
	public Employee(int id, String name,String salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	void dispaly()
	{
		System.out.println("id:" + id+ " "+"name:"+name + " salary:"+salary);
	}
	 public static void main(String[] args) {
		Employee e1=new Employee(111, "pinki", "pune");
		Employee e2=new Employee(123, "durga", "natthu");
		e1.dispaly();
		e2.dispaly();


}
 }
/* public class Employee
 {
	 public static void main(String[] args) {
		Employee1 e1=new Employee1(111, "pinki", "pune");
		Employee e=new Employee();
		e1.dispaly();
	}
 }
*/