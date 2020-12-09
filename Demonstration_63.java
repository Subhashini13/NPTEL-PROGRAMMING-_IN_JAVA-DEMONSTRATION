//Super class
class A{
	int i;
}
class B extends A{
	int i; // this hides i of class i that is overidding
	B(int a, int b ){
		super.i = a;
		i = b;
	}
	void show(){
		System.out.println(" i in superclass  A " +super.i);
		System.out.println(" i in subclass  B  " + i);
	}
}
class Demonstration_63{
	public static void main(String args[]){
		B b = new B(12,34);
		b.show();
	}
}
		
		
