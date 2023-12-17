import java.util.Scanner;

public class CelsiusToFahrenheit {

public static void main(String[] args) {

Scanner cel = new Scanner (System.in);

System.out.print("Enter a degree in Celsius: ");

double celsius = cel.nextDouble();

double fahrenheit = (9.0 / 5) * celsius + 32;

System.out.printf("%.0f Celsius is %.1f Fahrenheit", celsius, fahrenheit);



}


}