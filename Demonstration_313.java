//Special use of this keyword 
class A{
	A(){
		this(5);
		System.out.println("hello a");
	}
	A(int x){
		System.out.println(x);
	}
}
class Demonstration_313{
	public static void main(String args[]){
		A a = new A();
	}
}
