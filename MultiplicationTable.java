import java.util.Scanner;

public class MultiplicationTable {
	public static void main (String[] args) {

		Scanner input = new Scanner (System.in) ;

		System.out.print("Enter a number between 1 - 12: ") ;

		if (input.hasNextInt()) {
		int userInput = input.nextInt() ;

		if (userInput == 0 || userInput >12 || userInput < 1) {
			System.out.print("You entered a wrong range of numbers") ;
		} else
		if (userInput >=1 || userInput <= 12) {

			int counter = 1;

				while (counter <= 12) {
					int answer = userInput * counter ;
		
					System.out.printf("%d x %d = %d%n", userInput, counter, answer) ;
					counter = counter +  1;
			}
		}
		}

		if (input.hasNextDouble()) {
			System.out.println("You need to enter a whole number") ;
		} else

		if (input.hasNextLine()) {
			System.out.println("Don't enter an alphabet ode") ;
		}

	}

}