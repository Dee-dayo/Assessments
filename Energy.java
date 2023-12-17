import java.util.Scanner;

public class Energy {

public static void main(String[] args) {

Scanner input = new Scanner(System.in) ;

System.out.print("Enter the amount of water in kilograms: ");
float waterInKilogram = input.nextFloat() ;

System.out.print("Enter the initial temperature: ");
float initialTemperature = input.nextFloat() ;

System.out.print("Enter the final temperature: ") ;
float finalTemperature = input.nextFloat() ;

float energy = waterInKilogram * (finalTemperature - initialTemperature) * 4184 ;

System.out.printf("The energy needed is %.2f", energy) ;


}


}