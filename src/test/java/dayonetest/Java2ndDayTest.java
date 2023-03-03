package dayonetest;

import Javadayone.Java2ndDay;

public class Java2ndDayTest {

	
	
	public static void main(String[] args) {
		
		//  src/main/java -class if static word a( condition only static not there)
		//not in  method  there then you need to
		//create object. 
		// void return nothing
		
		Java2ndDay obj= new Java2ndDay();
		
	obj.getSalary();
	obj.money() ;
	// getSalary method was void so void return nothing so prinln not work.
	// Example 
	//System.out.println(obj.getSalary); not working because void 
	System.out.println(obj.money()); // method return something then it works 
	// example string money method return something so println method work
	
	//getIncome has static word then no need create object
	//so we need to class name. static method name work example
	
	Java2ndDay.getIncome();
	// obj.getIncome(); Don work properly
	}
}
