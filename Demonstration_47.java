
//INPUT USING SCANNER CLASS

import java.util.*;
class Demonstration_47{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("please find the entered data is to mximum");
		int a = sc.nextInt();
		int b=sc.nextInt();
		if(a>b){
			System.out.printf("%d is maximum", a);
		}
		else{
			System.out.printf("%d is maximum among two",b);
			
		}
	}
}