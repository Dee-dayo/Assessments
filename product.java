import java.util.Scanner;

public class Product {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter first integer: ");
int num1 = input.nextInt();

System.out.print("Enter second integer: ");
int num2 = input.nextInt();

System.out.print("Enter third integer: ");
int num3 = input.nextInt();

int product = num1 * num2 * num3;

System.out.printf("The product of the three integers are %d%n", product);


}





}