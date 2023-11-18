import java.util.Scanner;

public class NonDecreasingNumber {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter first integer: ");
int num1 = input.nextInt();

System.out.print("Enter second integer: ");
int num2 = input.nextInt();

System.out.print("Enter third integer: ");
int num3 = input.nextInt();

int largest = 0;
int smallest = 0 ;
int middle = 0;

if (num1 > num2 && num1 > num3)
largest = num1;
if (num2 > num1 && num2 > num3)
largest = num2;
if (num3 > num1 && num3 > num1)
largest = num3; 

if (num1 < num2 && num1 < num3)
smallest = num1;
if (num2 < num1 && num2 < num3)
smallest = num2;
if (num3 < num1 && num3 < num1)
smallest = num3; 

if (num1 != largest && num1 != smallest)
middle = num1;
if (num2 != largest && num2 != smallest)
middle = num2;
if (num3 != largest && num3 != smallest)
middle = num3; 

//System.out.printf("The highest %d, middle %d, and smallest %d", largest, middle, smallest);
System.out.printf("%d, %d, %d", smallest, middle, largest);

}



}