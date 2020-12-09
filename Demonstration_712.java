class A{
	int i;
	private int j;
	void setij(int x, int y){
		i= x;
		j=y;
	}
}
class B extends A{
	int total;
	void sum(){
		total = i + j; //j is not accessible due to private
		System.out.println("Total is " total);
	}
}
class Demonstration_712{
	public static void main(String args[]){
		B obj = new B();
		obj.setij(6,78);
		obj.sum();
		
		
	}
}
		
		

		
	
	