//Accessing a package from java API 
import java.lang.*;
class Calculator{
	double i;
	double x;
	void p(){
		x= Math.sqrt(i);//sqrt is class method of java.lang package
	}
}
class Demonstration_81{
	public static void main(String args[]){
		Calculator a = new Calculator();
		a.i = 2;
		a.p();
		System.out.println("Square root of "+ a.i+ " is " +a.x);
	}
}
