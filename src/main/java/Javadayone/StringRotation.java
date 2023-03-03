package Javadayone;

public class StringRotation {
	
	
	void getSalary(){
		//int num = 100;
		
		String name= "Sarower" ;  
		
		//System.out.println(name);	 // only type name sarower
		System.out.println(name.length()); // total letter for sarower =7
		
		//for(int i=0 ; i<7; i++) {   // it will show  0123456
		//System.out.println(i);	
		
		//for(int i= 0; i<name.length(); i++) {  //result 0123456
			//System.out.println(i);
		
		//for(int i=0; i <name.length(); i++) {  // result will be s -a-r-o-w-e-r -regular
			//System.out.println(name.charAt(i));
			
		for( int i =(name.length() - 1);i>=0; i--) { // result reverse r-e-w-o-r-a-s
			//System.out.println( name.charAt(i));
			System.out.print(name.charAt(i));// result same line reworas
		 
		}
			
		}
	// for(int i=0; i<name.length(); i++); // for( start =0; end=7 ; ++) {}
			
			
		public static void main(String[] args) {
			
			StringRotation obj = new StringRotation ();
			obj.getSalary();
		}
		}
		
		
		
		//ring =yes synchronization & thread safe & performance
		//faster than String == stringBuilder == always class
		
		//String obj= new String ("Sarroer" ); //synchro+ thread + medium
		//StringBuilder lastname= new StringBuilder("Sarroer");// faster  not safe and no thread
		
	//StringBuffer obj1= new StringBuffer();  //purely sycho & thread safe and poor
		
		//
	  //}

	
	   //}


