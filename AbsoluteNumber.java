import java.util.Scanner;

public class AbsoluteNumber {

	public static void main (String [] args) {
	Scanner input = new Scanner (System.in) ;
	
	System.out.print("Enter a number: ") ;
	int num = input.nextInt() ;
	
	int absolute = 0 ;

	if (num > 0) {
		absolute = num - absolute;
	}
	if (num < 0) {
		absolute -= num ;
	}

	System.out.printf("The absolute value of %d is %d%n", num, absolute) ;

}


}