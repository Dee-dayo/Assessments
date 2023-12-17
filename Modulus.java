import java.util.Scanner;

public class Modulus {

public static void main(String [] args) {

Scanner inputNumber = new Scanner(System.in);

System.out.print("Enter first number: ");
double num1 = inputNumber.nextDouble();

System.out.print("Enter second number: ");
int num2 = inputNumber.nextInt();

double modulus = num1 % num2;

System.out.print("The remainder is: " + modulus);





}

}