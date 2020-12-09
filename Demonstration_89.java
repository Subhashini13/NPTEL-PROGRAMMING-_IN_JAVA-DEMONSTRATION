// didnt run

import mypackage.Balance;
class Saving extends Balance{
	String branch;
	int customerID;
	Saving(String s, double bal, String br, int id){
		super(n,bal);
		branch=br;
		customerID=id;
	}
	public void show(){
		if(bal < 0){
			System.out.println("Sorry negative balance");
		}
		System.out.println(name + " " +bal);
	}
}
class Demonstration_89{
	public static void  main(string args[]){
		Saving s[]= new Saving[3];
		s[0] = new Saving['Subhi', 12,'kolkata',233];
		s[1] = new Saving['Priyam', 23,'delhi',121];
		s[2] = new Saving['Sonal', -12,'mumbai',1];
		
		for(int i =0 ; i<3; i++){
			s[i].show();
	}
}


		
	
	
