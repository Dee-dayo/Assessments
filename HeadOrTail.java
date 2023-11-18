import java.util.Scanner;
import java.util.Random;

public class HeadOrTail {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

Random random = new Random();
int upperbound = 2;

System.out.println("Head is 0, Tail is 1");
System.out.print("Guess if coin is head or tail: ");
int guess = input.nextInt();

int randomNumber = random.nextInt(upperbound);

if (guess == randomNumber) System.out.println("Your guess is correct");
if (guess != randomNumber) System.out.println("Your guess is incorrect");

System.out.printf("Random number %d and Your guess %d", randomNumber, guess);



}



}