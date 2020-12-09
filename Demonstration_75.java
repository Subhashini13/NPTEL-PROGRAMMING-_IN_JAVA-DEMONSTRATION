class A {
	public int data= 40;
	public void msg(){
		System.out.println(" Class A: Hello Java");
	}
}
public class Demonstration_75{
	public static void main(String args[]){
	A obj = new A();
	System.out.println(obj.data);
	obj.msg();
	}
}


