import java.util.Scanner;

public class FeetToMeters {

public static void main(String[] args) {

Scanner feet = new Scanner(System.in) ;

System.out.print("Enter a value for feet: ") ;
float noInFeet = feet.nextFloat() ;

double noInMetres = noInFeet * 0.305 ;

System.out.printf("%.1f feet is %.4f meters", noInFeet, noInMetres) ;



}



}