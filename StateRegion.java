import java.util.Scanner;

public class StateRegion {
	public static void main (String[] args) {
	
		Scanner input = new Scanner (System.in) ;

		System.out.print("Enter which state you are from: ") ;
		String state = input.nextLine();
		
		if (state.equalsIgnoreCase ("kebbi") || state.equalsIgnoreCase ("sokoto") || state.equalsIgnoreCase ("kastina") || state.equalsIgnoreCase ("zamfara") || state.equalsIgnoreCase ("kaduna") || state.equalsIgnoreCase ("kano")) {
			System.out.println("You are from NW");
		} else
		if  (state.equalsIgnoreCase ("adamawa") || state.equalsIgnoreCase ("yobe") || state.equalsIgnoreCase ("borno") || state.equalsIgnoreCase ("bauchi") || state.equalsIgnoreCase ("gombe") || state.equalsIgnoreCase ("taraba") || state.equalsIgnoreCase ("jigawa"))  {
			System.out.println("You are from NE");	
		} else
		if  (state.equalsIgnoreCase ("plateau") || state.equalsIgnoreCase ("kwara") || state.equalsIgnoreCase ("kogi") || state.equalsIgnoreCase ("benue") || state.equalsIgnoreCase ("niger") || state.equalsIgnoreCase ("nasarawa") || state.equalsIgnoreCase ("FCT"))  {
			System.out.println("You are from NC");	
		} else
		if  (state.equalsIgnoreCase ("lagos") || state.equalsIgnoreCase ("ondo") || state.equalsIgnoreCase ("osun") || state.equalsIgnoreCase ("oyo") || state.equalsIgnoreCase ("ogun") || state.equalsIgnoreCase ("ekiti"))  {
			System.out.println("You are from SW");	
		} else
		if  (state.equalsIgnoreCase ("abia") || state.equalsIgnoreCase ("anambra") || state.equalsIgnoreCase ("ebonyi") || state.equalsIgnoreCase ("enugu") || state.equalsIgnoreCase ("imo"))  {
			System.out.println("You are from SE");	
		} else
		if  (state.equalsIgnoreCase ("bayelsa") || state.equalsIgnoreCase ("edo") || state.equalsIgnoreCase ("cross river") || state.equalsIgnoreCase ("delta") || state.equalsIgnoreCase ("rivers") || state.equalsIgnoreCase ("awka"))  {
			System.out.println("You are from SS");	
		} else {
			System.out.println("Are you sure you are a Nigierian???");
		}
	}
}