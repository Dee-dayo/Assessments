import java.util.Scanner;

public class AccountChallenge {

	public static void main (String[] args) {

	Scanner input = new Scanner (System.in) ;
	Account newAcc = new Account () ;

	System.out.println("Welcome to Maverick Bank") ;
	System.out.print("Enter your id: ");
	int idNo = input.nextInt() ;
	newAcc.setId(idNo) ;
	int name = newAcc.getId() ;
	
	System.out.printf("Welcome %d%n%n", name);

	System.out.print("Enter your initial balance: ");
	double initialBalance = input.nextDouble() ;
	newAcc.setBalance(initialBalance) ;
	double balance = newAcc.getBalance() ;

	System.out.printf("Your current balance is %.3f%n%n", balance);

	System.out.print("Enter annual interest rate: ");
	double annualInterest = input.nextDouble() ;
	newAcc.setAnnualInterestRate(annualInterest) ;

	System.out.print("\nEnter date created: ");
	String date = input.next() ;
	newAcc.setDateCreated(date) ;

	System.out.print("\nWould you like to withdraw: ") ;
	String answer = input.next() ;
		if (answer.equals ("yes")) {
			System.out.print("Enter withdraw amount: ") ;
			double amount = input.nextDouble(); 
				if (amount > newAcc.getBalance() ) {
					double total = amount - newAcc.getBalance() ;
					newAcc.setBalance(total) ;
					System.out.print("Withdraw amount exceeded") ; }
				if (amount < newAcc.getBalance() ) {
					System.out.print("Withdraw Successfull") ; }
		}
		if (answer.equals("no")) { System.out.print("Osheyy! Odogwu");
		}

	System.out.print("\n\nWould you like to deposit: ") ;
	String answer1 = input.next() ;
		if (answer1.equals ("yes")) {
			System.out.print("How much will you like to deposit: ") ;
			double amount1 = input.nextDouble(); 
			double newAmount = amount1 +  newAcc.getBalance() ;
			newAcc.setBalance(newAmount) ;
			System.out.printf("You new balance is: %.3f%n%n", newAmount) ; }
		else
		if (answer1.equals("no")) { System.out.print("Next time then");
		}

	double monthInterest = newAcc.getMonthlyInterest() ;	

	System.out.printf("%n%nYour monthly Interest is this: %.3f", monthInterest);
	System.out.printf("%nThanks for banking with us");



}
}