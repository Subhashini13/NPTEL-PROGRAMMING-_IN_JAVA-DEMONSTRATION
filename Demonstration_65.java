//Example of MUltilevel Herarchy;
class Box{
	private double width;
	private double height;
	private double depth;
	
	Box(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	double volume(){
		return width * depth * height ;
	}
}
class BoxWeight extends Box{
	double weight ;
	BoxWeight(double w, double h, double d, double m){
		super(w,h,d);//call superclass constructor
		weight = m;
	}
}
class Shipment extends BoxWeight{
	double cost;
	Shipment(double w, double h, double d, double m, double c){
		super(w,h,d,m);
		cost = c;
	}
}
class Demonstration_65{
	public static void main(String args[]){
		Shipment s1 = new Shipment(12,23,34,45,56);
		double vol;
		vol = s1.volume();
		System.out.println("Volume = " +vol);
		System.out.println("weight = " +s1.weight);
		System.out.println("Cost = "+s1.cost);
	}
}
		
	

		
