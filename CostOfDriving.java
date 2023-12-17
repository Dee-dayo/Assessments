import java.util.Scanner;

public class CostOfDriving {

public static void main(String[] args) {

Scanner input = new Scanner (System.in) ;

System.out.print("Enter the driving distance: ") ;
float distance = input.nextFloat() ;

System.out.print("Enter miles per gallon: ") ;
float fuelEfficiency = input.nextFloat() ;

System.out.print("Enter price per gallon: ") ;
float pricePerGallon = input.nextFloat() ;

float cost = distance / fuelEfficiency * pricePerGallon ;

System.out.printf("The cost of driving is $%.2f", cost) ;

}



}