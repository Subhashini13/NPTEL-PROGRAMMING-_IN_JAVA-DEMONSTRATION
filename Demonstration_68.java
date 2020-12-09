//Abstract class with final method

abstract class Base{
	final void fun(){
		System.out.println("Final fun is called");
		
	}

}
class Derived extends Base{
}
class Demonstration_68{
	public static void main(String args[]){
		Base b = new Derived();
		b.fun();
	}
}
	
		