package com.AbstractClass;

// An abstract class with a final method
abstract class Base {
    final void fun() { System.out.println("Derived fun() called"); }
}
  
class Derived extends Base {}
  
class Abstract1 {
    public static void main(String args[]) { 
       Base b = new Derived();
       b.fun();
    }
} 