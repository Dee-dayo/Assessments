import java.util.Scanner ;

public class Sales {

	public static void main (String [] args) {

	Scanner input = new Scanner (System.in) ;

	System.out.println("Enter an item name: ") ;
	String name = input.nextLine () ;

	System.out.printf("Enter the price of %s:%n", name) ;
	double price = input.nextDouble() ;

	double discount = price - (price * 0.1) ;
	System.out.println("----------------") ;
	System.out.printf("Item: %s%n", name) ;
	System.out.printf("Price: %.0f%n", price) ;
	if (price < 0) {
		System.out.println("You can't have a negative price oga") ;
	}
	else 
	if (price == 0) {
		System.out.println("You didnt enter a price oga") ;
	}
	else {
		System.out.printf("Grand Total: %.2f%n", discount) ;
	}
	System.out.print("----------------") ;

}


}