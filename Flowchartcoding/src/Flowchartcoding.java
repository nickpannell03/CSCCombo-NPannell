import java.util.Scanner;

public class Flowchartcoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many credits are you taking?");
		int creds = input.nextInt();
		
		 int total = (creds * 580) + 650;
		 
		 
		 if (creds > 12) {
			 total = total + 250;
		 }
		 else {
			 System.out.println("Would you like to pay the fee?");
			 
			String str = input.next();
			if (str.equals ("y")) {
				 total = total + 250;
			 }
			
			 
		 }
	System.out.println("The total tuition is: " + total);

	}

}
