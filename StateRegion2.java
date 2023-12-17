import java.util.Scanner;

public class StateRegion2 {
	public static void main (String[] args) {
	
		Scanner input = new Scanner (System.in) ;

		System.out.print("Enter which state you are from: ") ;
		String state = new Scanner (System.in) .nextLine();

		switch (state) {
		
			case "kebbi", "sokoto", "kastina", "zamfara", "kaduna", "kano" ->
					System.out.println("You are from NW");

			case "adamawa", "yobe", "borno", "bauchi", "gombe", "taraba", "jigawa" ->
					System.out.println("You are from NE");

			case "plateau", "kwara", "kogi", "benue", "niger", "nasarawa", "fct" ->
					System.out.println("You are from NC");	

			case "lagos", "ondo", "osun", "oyo", "ogun", "ekiti" ->
					System.out.println("You are from SW");	

			case "abia", "anambra", "ebonyi", "enugu", "imo" ->
					System.out.println("You are from SE");

			case "bayelsa", "edo", "cross-river", "delta", "rivers", "awka" ->
					System.out.println("You are from SS");	

			default -> System.out.println("Are you sure you are a Nigierian???");
	
		}
		
	}
}