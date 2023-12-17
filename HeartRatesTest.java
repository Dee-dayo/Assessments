import java.util.Scanner ;

public class HeartRatesTest {
	public static void main (String[] args) {

	Scanner input = new Scanner (System.in);
	HeartRates patient1 = new HeartRates ("", "", 1, 1, 1) ;

	System.out.print("Enter your first name: ");
	String firstName = input.nextLine() ;
	patient1.setFirstName (firstName) ;

	System.out.print("Enter your last name: ") ;
	String lastName = input.nextLine() ;
	patient1.setLastName (lastName) ;

	System.out.print("Enter day of birth: ") ;
	int day = input.nextInt() ;
	patient1.setDay(day) ;

	System.out.print("Enter month of birth: ") ;
	int month = input.nextInt() ;
	patient1.setMonth(month) ;

	System.out.print("Enter year of birth: ") ;
	int year = input.nextInt() ;
	patient1.setYear(year);


	System.out.printf("Welcome %s %s%n", patient1.getFirstName(), patient1.getLastName());
	System.out.printf("Date of birth: %d - %d - %d%n", patient1.getDay(), patient1.getMonth(), patient1.getYear()) ;
	System.out.printf("You are %d years old%n", patient1.noOfYears()) ;
	System.out.printf("Your maximum heart rate is %d", patient1.maxHeartRate()) ;
	System.out.println("");
	System.out.printf("Your target heart-rate range is %.2f - %.2f", patient1.minTargetHeartRate(), patient1.maxTargetHeartRate());

}

}