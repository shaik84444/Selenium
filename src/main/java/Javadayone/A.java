package Javadayone;

abstract class A {
	abstract void display();

}
class B extends A{
	
	void display() {
		System.out.println("Abstract method A");
	}

}

class AstractMain{
	
	public static void main(String[] args) {
		B obj= new B();
		obj.display();
	}
}