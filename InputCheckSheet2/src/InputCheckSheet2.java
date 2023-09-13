import java.util.Scanner;

public class InputCheckSheet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word;
		int intNum;
		float realNum;
		double biggerRealNum;
		char letter;
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter words here:  ");

			word = input.nextLine();
			System.out.println("The words go here " +  word );

			System.out.println("Enter a intNum here: ");
			
			intNum = input.nextInt();
			System.out.println("The intNum goes here " +  intNum );
			
			System.out.println("Enter a real number here: ");
			
			realNum = input.nextFloat();
			System.out.println("The real number goes here " + realNum );
			
			System.out.println("Enter a bigger real number here: ");
			biggerRealNum = input.nextDouble();
			System.out.println("The bigger real number goes here " + biggerRealNum );
			
			System.out.println("Enter a single letter here: ");
			letter = input.next().charAt(0);
		}

		System.out.println("The single letter goes here " + letter);
		
	
	
		

	}

}
