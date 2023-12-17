import java.util.Scanner;

public class Comparison {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter first number: ");
int number1 = input.nextInt();

System.out.print("Enter second number: ");
int number2 = input.nextInt();

if (number1 == number2) {
System.out.printf("The first number %d is equals to the second number %d%n", number1, number2);
}

if (number1 != number2) {
System.out.printf("The first number %d is not equals to the second number %d%n", number1, number2);
}

}

}