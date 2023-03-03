package ConstructorAndDataType;

public class ConstructorDataType {
   int age;        // just want to see what is default value if age is not declare value.
   double money;
   String name ;
   Boolean condition ;
   //  constructor same as a method but class name is same as method name.
	
public  ConstructorDataType( String name) {   
	// constructor can not use void word so return always something 
	// constructor - method name and class name are same.
		// constructor use for null value avoid and put some value
	// Constructor use all the   if you create object 
	// constructor is two kind 1. parameter constructor 2. non parameter constructor
	// Constructor can pass value all method
		this.name= name; // this--- key meaning one object to another object.
	}
	
	public void Getlogin() {
		
	System.out.println(age);	 // run result 0
	
	System.out.println(money);  // run result 00
	System.out.println(name);    //  runresult null //java dont like null value
	System.out.println(condition);
	}
}
