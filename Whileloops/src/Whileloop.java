import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
//		
//		int i = 5;
//		int num1 = 4;
//		int num2 = 1;
//		
//		while (i>0) {
//			num2 = num2 * num1;
//			System.out.println("i : " + i + " + num2 : " + num2);		
//			i--;

		int age = -1;
		String name;
		while (age < 0) {

			System.out.println("What is your name?");

			name = input.next();
			age++;
		}

		while (age < 3) {
			System.out.println("What is your age?");
			age = input.nextInt();
			

		}
		System.out.println("This your name and age");
	}

}
