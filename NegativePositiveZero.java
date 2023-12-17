import java.util.Scanner ;

public class NegativePositiveZero {

	public static void main (String[] args) {
	
	Scanner number = new Scanner (System.in) ;

	System.out.print("Enter first number: ") ;
	int num1 = number.nextInt() ;

	System.out.print("Enter second number: ") ;
	int num2 = number.nextInt() ;

	System.out.print("Enter third number: ") ;
	int num3 = number.nextInt() ;

	System.out.print("Enter fourth number: ") ;
	int num4 = number.nextInt() ;

	System.out.print("Enter fifth number: ") ;
	int num5 = number.nextInt() ;

	int positive = 0 ;
	int negative = 0 ;
	int zero = 0 ;

	if (num1 > 0) {positive = positive + 1; }
	if (num1 < 0) {negative = negative + 1;	}
	if (num1 == 0) {zero = positive + 1;}

	if (num2 > 0) {positive = positive + 1; }
	if (num2 < 0) {negative = negative + 1;	}
	if (num2 == 0) {zero = positive + 1;}

	if (num3 > 0) {positive = positive + 1; }
	if (num3 < 0) {negative = negative + 1;	}
	if (num3 == 0) {zero = positive + 1;}

	if (num4 > 0) {positive = positive + 1; }
	if (num4 < 0) {negative = negative + 1;	}
	if (num4 == 0) {zero = positive + 1;}

	if (num5 > 0) {positive = positive + 1; }
	if (num5 < 0) {negative = negative + 1;	}
	if (num5 == 0) {zero = positive + 1;}

	System.out.printf("The total number of postive numbers input is %d%n", positive) ;
	System.out.printf("The total number of negative numbers input is %d%n", negative) ;
	System.out.printf("The total number of zero numbers input is %d%n", zero) ;


}
}