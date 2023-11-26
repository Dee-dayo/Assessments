public class NumberOfEvenOdd {
	public static void main (String[] args) {

	int evenNumber = 0 ;
	int oddNumber = 0 ;
	int number = 1 ;

	while ( number <= 101 ) {
		if (number % 2 == 0) {
			evenNumber += 1; }
		else
			oddNumber += 1;
	}
	number += 1;
	
	System.out.printf("The number of even numbers is: %d%n", evenNumber) ;
	System.out.printf("The number of odd numbers is %d", oddNumber) ;

}

}