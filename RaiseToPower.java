import java.util.Scanner ;

public class RaiseToPower {
	public static void main (String[] args) {

		Scanner input = new Scanner (System.in) ;

		System.out.print("Enter the number: ") ;
		int num = input.nextInt() ;

		System.out.print("Enter the raise to power number: ") ;
		int power = input.nextInt() ;

		int answer = 1 ;

		while (power != 0) {
			answer *= num ;

			power -- ;
		}
		System.out.printf("%n%d raise to power %d= %d", num, power, answer) ;
	}
}