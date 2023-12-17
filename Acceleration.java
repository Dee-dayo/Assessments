import java.util.Scanner ;

public class Acceleration {

public static void main(String[] args) {

Scanner numbers = new Scanner(System.in);

System.out.print("Enter the starting velocity in meters/second: ");
float startingVelocity = numbers.nextFloat();

System.out.print("Enter the ending velocity in meters/second: ");
float endingVelocity = numbers.nextFloat();

System.out.print("Enter time span in seconds: ");
float time = numbers.nextFloat();

double acceleration = (endingVelocity - startingVelocity) / time;

System.out.printf("The average acceleration is %.4f%n", acceleration);

}


}