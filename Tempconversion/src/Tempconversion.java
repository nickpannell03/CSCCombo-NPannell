import java.util.Scanner;

public class Tempconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double temp;
		
		System.out.println("What is the temp?");
		Scanner input = new Scanner(System.in);
		
		temp = input.nextDouble();
		temp = (temp-32) * (5.0/9);
		System.out.println("The temp in celsuis is: " + temp);
		
		temp = (temp + 273.15);
		System.out.println("The temp in kelvin is; " + temp);
	
		
		

	}

}
