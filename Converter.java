import java.util.Scanner;

public class Converter {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter weight in pounds: ") ;
float weightInPound = input.nextFloat() ;

System.out.print("Enter height in inches: ") ;
float heightInInches = input.nextFloat() ;

double weightInKilogram = weightInPound * 0.45359237;

double heightInMeter = heightInInches * 0.0254;

double squareMeter = heightInMeter * heightInMeter;

double bodyMassIndex = weightInKilogram / squareMeter;

System.out.printf("BMI is %f%n", bodyMassIndex);





}


}