class Point{
	int x,y;
	void setPoint(){
		x=10;
		y=10;
	}
}

class Demonstration_34{
	float distance;
	public static void main(String args[]){
		Point p= new Point();
		p.setPoint();
		System.out.println("x  =  "+p.x);
		System.out.println("y = "+p.y);
	}
}

