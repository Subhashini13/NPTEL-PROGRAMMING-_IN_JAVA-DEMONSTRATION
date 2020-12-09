//Access modifier with public private potected;

class BaseClass{
	public int i =0;
	protected int y = 10;
	private int z = 20;
	int a = 19;
	public int getX(){
		return x;
	}
	public void setX(int x){
		this.x = x;
	}
	protected int getY(int y){
	return y;
	}
	
	protected void setY(int y){
		this.y=y;
	}
	
	private int getZ(){
		return z;
	}
	private void setZ(int z){
		this.z= z;
	}
	 int getA(){
		return a;
	}
	 void setA(int a){
		this.a= a;
	}
}
class Demonstration_714 extends BaseClass {
	public static void main(String args[]){
		BaseClass b= new BaseClass();
		b.z=0;
		Demonstration_715 ob = new Demonstration_715();
		System.out.println("Value of x is " + ob.x);
		ob.setX(19);
		System.out.println("Value of  y is " + ob.y);
		ob.setY(13);
		/*
		System.out.println("Value of x is " + ob.z);
		ob.setZ(33);
		*/
		System.out.println("Value of x is " + ob.a);
		ob.setA(34);
	}
}

	
	
