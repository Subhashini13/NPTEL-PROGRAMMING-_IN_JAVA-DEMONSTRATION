import  java.util.Scanner;
class Demonstration_48{
	public static void main(String args[]){
		System.out.print("Enter the radius");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		double area = 3.14* radius * radius ;
		System.out.println("Area = " +area );
	}
}

