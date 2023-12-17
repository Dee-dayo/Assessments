import java.util.Scanner;

public class Length {

public static void main(String[] args) {

Scanner input = new Scanner(System.in) ;

System.out.print("Enter speed in meters/second: ") ;
float takeOffSpeed = input.nextFloat() ;

System.out.print("Enter accelerartion in meters/second:  ") ;
float acceleration = input.nextFloat() ;

float length = (takeOffSpeed * takeOffSpeed) / (acceleration * 2) ;

System.out.printf("The minimum runway length for this airplane is %.3f", length) ;



}




}