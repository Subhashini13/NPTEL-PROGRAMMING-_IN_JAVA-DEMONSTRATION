//USE OF THIS KEYWORD TO INVOKE CURRENT CLASS METHOD

class A{
	void m(){
		System.out.println("hello m");
	}
	void n(){
		System.out.println("hello n");
		this.m();
	}
}
class Demonstration_312{
	public static void main(String args[]){
		A a= new A();
		a.n();
	}
}