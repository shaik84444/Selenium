package Encaptulation;

public class EncaptulationTest {
  // Encapsulation always private 
	private static int salary =5000; // when static no need create object
	//private static String name="shahin"; // just for string variable
		
	}                          // private no body can see salary should be hide
// method will be public
	public static int getSalary() { // right button click and go to source then
		                            // getter and setter set up , 1st method with out void 
		                            // get and other with void set will be create .
		return salary;
		System.out.println(salary);
	}

	public static void setSalary(int salary) {
		EncaptulationTest.salary = salary;
	}
	
}
