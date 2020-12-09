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
class Demonstration_62b {
	public static void main(String args[]){
		Boxweight bw1 = new Boxweight(3,5,7,8.54);
		Box plainbox = new Box();
		double vol ;
		
		vol = bw1.volume();
		System.out.println("volume of weightbox " + vol );
		System.out.println("weight of bw1 = " +bw1.weight);
		System.out.println();
		
		plainbox = bw1;
		vol= plainbox.volume();
		System.out.println("Volume of Plainbox =" +vol);
		//System.out.println("weight of plainbox = " +plainbox.weight);
		// here plainbox  doesnot define weight member
		
	}
}	

	