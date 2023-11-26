import java.util.Scanner ;

public class SumAverage {
	public static void main (String[] args) {
	
	Scanner input = new Scanner (System.in) ;
	
	int total = 0;
	int count = 0 ;
	
	System.out.print("Enter an integer (press 0 to finish): ") ;
	int num = input.nextInt() ;

	while (num != 0) {
		total += num ;
		count += 1;

		System.out.print("Enter an integer (press 0 to finish): ") ;
		num = input.nextInt() ;
	}
	
	double average = (double) total / count ;

	System.out.printf("The sum of the numbers is: %d%n", total) ;
	System.out.printf("The average of the numbers is: %.2f", average) ;
	
}
}