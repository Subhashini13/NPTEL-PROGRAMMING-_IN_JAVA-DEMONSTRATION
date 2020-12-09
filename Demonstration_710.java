class A{
	protected int rollno = 555;
	protected void msg(){
		System.out.println("Class A: Hello  java " +rollno );
	}
}
class Demonstration_710 {
	public static void main(String args[]){
		A obj = new A();
		obj.msg();
		//obj.rollno();
		System.out.println("class a : Hello Java " +obj.rollno);
	}
}
	

