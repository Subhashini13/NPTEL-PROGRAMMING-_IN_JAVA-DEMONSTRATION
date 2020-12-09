class Circle{
	double x,y;
	double r;
	double circumference(){
		return 2*3.14159*r;
	}
	double area(){
		return (22/7)*r*r;
	}
	
}
class Box{
	
	double width;
	double height;
    double depth;
	double area(){
		double a;
		a=(width*height+height*depth+width*depth)*2;
		return a;
	}
	double volume(){
		double v;
		v= width*height*depth;
		return v;
	}
}
		


class Demonstration_33{
	public static void main(String[] args){
		Circle c= new Circle();
		Box b= new Box();
		c.x=3.0;
		c.y=4.0;
		c.r=5.0;
		b.width=3.0;
		b.height=4.0;
		b.depth=5.0;
		System.out.println("Circumference Circle 1  = " +c.circumference());
		System.out.println("Area Circle 1 =  " +c.area());
		System.out.println("Volume of  Circle 2 =  " +b.volume());
		System.out.println("Area  Circle 2 =  " +b.area());
	}
}
		
		
	
