//Program to check command line arguments

class Demonstration_45{
	public static void main(String args[]){
		//check the length of array
		//greater than zero or not
		if(args.length > 0){
			System.out.println("the command line argument are:");
			for(String val:args)
				System.out.println(val);
		}
		else{
			System.out.println("No command line arguments found");
		}
	}
}
	
