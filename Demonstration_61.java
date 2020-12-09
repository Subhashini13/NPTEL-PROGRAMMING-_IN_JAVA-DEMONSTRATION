class A{
	int i,j;
	void showij(){
		System.out.println("i and  j is " + i + " " +j);
	}
}
class B extends A {
	int  k;
	void showk(){
		System.out.println("K: " +k);
	}
	void sum(){
		System.out.println(" i+ j+k = " +(i+j+k));
	}
}

class Demonstration_61{
	public static void main(String args[]){
		A a = new A();
		B b= new B();
		a.i = 10;
		a.j= 20;
		System.out.println("contents are : " );
		a.showij();
		System.out.println();
		
		b.i=7;
		b.j=8;
		b.k=10;
		System.out.println(" contents of ths class are : " );
		b.showij();
		b.showk();
		b.sum();
		
	}
}
		
		
		
		
	