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
class Demonstration_62b{
	