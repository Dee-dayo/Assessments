import java.util.Scanner;
import java.util.Random;

public class Lottery {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

Random random = new Random();
int upperbound = 999;

int ranNum = random.nextInt(upperbound);

int ranNum1 = (ranNum / 100) % 10;
int ranNum2 = (ranNum / 10) % 10;
int ranNum3 = ranNum % 10;

System.out.print("Enter a three-digit number:  ");
int digit = input.nextInt();

int digit1 = (digit / 100) % 10;
int digit2 = (digit / 10) % 10;
int digit3 = digit %10;

if (digit == ranNum) System.out.println("CONGRATULATIONS!!! You just won $10, 000");
else 

if (
(digit1 == ranNum1 || digit1 == ranNum2 || digit1 == ranNum3) && 
(digit2 == ranNum1 || digit2 == ranNum2 || digit2 == ranNum3) && 
(digit3 == ranNum1 || digit3 == ranNum2 || digit3 == ranNum3)
) {
System.out.println("CONGRATULATIONS!!! You just won $3,000");
} 
else

if (
(digit1 == ranNum1 || digit1 == ranNum2 || digit1 == ranNum3) ||
(digit2 == ranNum1 || digit2 == ranNum2 || digit2 == ranNum3) ||
(digit3 == ranNum1 || digit3 == ranNum2 || digit3 == ranNum3)
) {
System.out.println("CONGRATULATIONS!!! You just won $1,000");
}
else

if (
(digit1 != ranNum1 || digit1 != ranNum2 || digit1 != ranNum3) ||
(digit2 != ranNum1 || digit2 != ranNum2 || digit2 != ranNum3) ||
(digit3 != ranNum1 || digit3 != ranNum2 || digit3 != ranNum3)
) {
System.out.println("You didn't win. TRY AGAIN!");
}

}



}