import java.util.Scanner;

public class PoundConverter {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter a number in pounds: ");
float noInPounds = input.nextFloat() ;

double noInKilograms = noInPounds * 0.454 ;

System.out.printf("%.2f pounds is %.3f kilograms", noInPounds, noInKilograms);


}

}