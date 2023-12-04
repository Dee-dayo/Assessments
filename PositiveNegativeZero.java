import java.util.Scanner;

public class PositiveNegativeZero {
	public static void main (String[] args) {
	
		Scanner input = new Scanner (System.in) ;

		int noOfIntegerPositive = 0;
		double noOfDecimalPositive = 0;
		int noOfIntegerNegative = 0;
		double noOfDecimalNegative = 0;
		int noOfIntegerZero = 0;
		double noOfDecimalZero = 0;
		
		System.out.print("Enter a number or any alphabet to end: ") ;

		while (input.hasNextInt()) {
			int integer = input.nextInt() ;
			System.out.print("Enter a number or any alphabet to end: ") ;
		
				if (integer > 0) {
					noOfIntegerPositive ++ ;
				} else
				if (integer < 0) {
					noOfIntegerNegative ++ ;
				} else
				if (integer == 0) {
					noOfIntegerZero ++ ;
				}
		}

		while (input.hasNextDouble()) {
			double decimal = input.nextDouble() ;
			System.out.print("Enter a number or any alphabet to end: ") ;

				if (decimal > 0.0) {
					noOfDecimalPositive ++ ;
				} else
				if (decimal < -0.1) {
					noOfDecimalNegative ++ ;
				} else
				if (decimal == 0.0) {
					noOfDecimalZero ++ ;
				}
		}
		
		if (input.hasNextLine()) {
		
		System.out.printf("%nThe number of positive numbers entered is %.0f%n", noOfIntegerPositive+noOfDecimalPositive) ;
		System.out.printf("The number of negative numbers entered is %.0f%n", noOfIntegerNegative+noOfDecimalNegative) ;
		System.out.printf("The number of zero numbers entered is %.0f%n", noOfIntegerZero+noOfDecimalZero) ;
		}

	}
}