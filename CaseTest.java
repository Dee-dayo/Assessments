import java.util.Scanner;

public class CaseTest {
	public static void main (String [] args) {
	
		Scanner input = new Scanner (System.in) ;

		System.out.print("Enter 15 as the number: ") ;
		int number = input.nextInt() ;

		switch (number) {
			case 1: 	System.out.println("This is to input what?") ;
					System.out.println("One") ;
					break ;
			case 2: 	System.out.println("This is to input what?") ;
					System.out.println("Two") ;
					break ;
			case 3: 	System.out.println("This is to input what?") ;
					System.out.println("Three") ;
					break ;
			case 4: 	System.out.println("This is to input what?") ;
					System.out.println("Four") ;
					break ;
			case 5: 	System.out.println("This is to input what?") ;
					System.out.println("Five") ;
					break ;
			default:	System.out.print("This is just a default case");
		
		}

	}
}