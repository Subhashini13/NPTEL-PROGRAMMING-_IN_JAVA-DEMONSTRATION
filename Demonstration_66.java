//Abstract class

abstract class Base{
	abstract void fun();
}
class Derived extends Base{
	void fun(){
		System.out.println("DErived class fun is called");
	}
}
class Demonstration_66{
	public static void main(String args[]){
		//Base b =  new base();
		Base b = new Derived();
		b.fun();
		
	}
}
		
