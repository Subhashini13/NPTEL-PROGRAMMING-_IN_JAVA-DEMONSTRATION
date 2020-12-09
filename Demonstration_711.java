/*
Example 1: protected  modifier
*/
class A{
	protected int rollno = 56;
	public void msg(){
		System.out.println("Class A: Hello Java");
	}
}

class Demonstration_711 extends A{
	public static void main(String args[]){
		A obj = new A();
		obj.msg();
	}
}