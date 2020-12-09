import java.io.*;
class Demonstration_49{
	public static void main(String args[]) throws Exception{
		Float principalAmount = new Float(0);
		Float rateofInterest = new Float(0);
		int numberOfYears = 0;
	//	try{
			DataInputStream in = new DataInputStream(System.in);
			String tempString;
			System.out.print("Enter Principal Amount ");
			System.out.flush();
			tempString = in.readLine();
			principalAmount= Float.valueOf(tempString);
			System.out.print("Enter rate of Interest : ");
			System.out.flush();
			tempString = in.readLine();
			rateofInterest = Float.valueOf(tempString);
			System.out.print("Enter Years ");
			System.out.flush();
			tempString = in.readLine();
			numberOfYears= Integer.parseInt(tempString);
		    float interestTotal = principalAmount * rateofInterest* numberOfYears;
			System.out.println("Toatal interset = " +interestTotal);
			
	/*	}
		catch(Exception ex)
		{
		}
		**/
		
	}
}
			
		
