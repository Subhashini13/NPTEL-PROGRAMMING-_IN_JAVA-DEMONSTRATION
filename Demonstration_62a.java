
// INHERITANCE

class Box{
	double width;
	double height;
	double depth;
	Box(){
		width=0.0;
		height=0.0;
		depth = 0.0;
	}
	Box(double w,double h,double d){
		width=w;
		height = h;
		depth=d;
	}
	double volume(){
		return width * height * depth;
	}
}
class Boxweight extends Box {
	double weight;
	Boxweight(double w, double h, double d , double m ){
		width= w;
		height = h;
		depth = d; 
		weight = m;
	}
}

class Demonstration_62a{
	public static void main(String args[]){
		Boxweight b1 = new Boxweight(10,20,34.5,87.9);
		Boxweight b2 = new Boxweight(23,45,67.8,76);
		double vol;
		vol = b1.volume();
		System.out.println("B=Volume of box b1 = " + vol );
		System.out.println("Weight of box b1 = "  +b1.weight);
		System.out.println();
		
		vol = b2.volume();
		System.out.println("B=Volume of box b2 = " + vol );
		System.out.println("Weight of box b2 = " +b2.weight);
		System.out.println();
	}
}
		
		
		
		
	
	
		
	