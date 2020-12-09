class A{
	protected int rollno = 555;
	protected void msg(){
		System.out.println("Class A: Hello Java " +rollNo);
	}
}
class Demonstration_79{
	public static void main(String args[]){
		A obj = new A();
		obj.msg();
		obj.rollno();
	}
}
