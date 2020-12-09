
//abstract clsass with non abstract method
abstract class Base{
	Base(){
		System.out.println("Base constructor is called");
	}
	void fun();
	
}
class Derived extends Base{
	Derived(){
		
		System.out.println("Derived constructor is called");
	}
	
	void fun(){
		super.fun();
		System.out.println("Derived fun is called");
	}
}
class Demonstration_66b{
	public static void main(String args[]){
		Derived d = new Derived();
		d.fun();
	}
}
	
			
		
