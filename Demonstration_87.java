import mypackage.*;
class Demonstration_87{
	public static void main(String args[]){
		Balance b[] = new Balance[3];
		b[0] = new Balance["Radhika",245.09];
		b[1] = new Balance["Rati",35.99];
		b[2] = new Balance["Raina", -109];
		
		
		for(int i = 0; i <3 ;i++){
			b[i].show();
		}
		
		
	}
}
