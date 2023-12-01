import java.security.SecureRandom ;
import java.util.Scanner ;

public class Guess {
	public static void main (String [] args) {
	
	Scanner input = new Scanner (System.in) ;
	SecureRandom random = new SecureRandom () ;

	int number = random.nextInt(1, 11) ;

	System.out.print("Guess a number between 1 - 10: ") ;
	int guess = input.nextInt() ;

	while (guess != 0 ) {
		if (guess > 10 || guess < 1) {
			System.out.printf("Your guess is not within the range, the range is between 1 - 10") ;
		}
		else {
		if (guess == number) {
			System.out.printf("Correct: Random Number = %d%nYour guess = %d", number, guess) ;
		} else
		if (guess < number) {
			System.out.printf("Too low: Random number = %d%nYour guess = %d", number, guess) ;
		} else
			System.out.printf("Too High: Random number = %d%nYour guess = %d", number, guess) ;
		}
		System.out.printf("%n%n");
		System.out.print("Guess a number between 1 - 10: ") ;
		guess = input.nextInt() ;
	}


}
}