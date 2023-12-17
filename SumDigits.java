import java.util.Scanner;

public class SumDigits {

public static void main(String[] args) {

Scanner digit = new Scanner(System.in);

System.out.print("Enter an integer: ");

int integer = digit.nextInt() ;

if (integer % 5 == 0 && integer % 6 == 0) System.out.printf("Is %d divisible by 5 and 6?  True%n", integer);
if (integer % 5 != 0 && integer % 6 != 0) System.out.printf("Is %d divisible by 5 and 6?  False%n", integer);
if (integer % 5 == 0 || integer % 6 == 0) System.out.printf("Is %d divisible by 5 or 6?  True%n", integer);
if (integer % 5 >= 0 || integer %6 >=0) System.out.printf("Is %d divisible by 5 or 6, but not both? True", integer);



}  



}