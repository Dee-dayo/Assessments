import java.util.Scanner;

public class PalindromeNumber {

public static void main(String[] args) {

Scanner integer = new Scanner(System.in);

System.out.print("Enter a three-digit integer: ");
int num = integer.nextInt();

int firstNum = (num / 100) % 10;
int secondNum = (num / 10) % 10;
int thirdNum = num % 10;

if (firstNum  == thirdNum) System.out.printf("%d is a palindrome", num);
if (firstNum != thirdNum) System.out.printf("%d is not a palindrome", num);


}



}