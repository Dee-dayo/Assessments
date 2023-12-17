import java.util.Scanner;

public class AgeToDays {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter your age: ");
int age = input.nextInt();

int days = age * 365;

System.out.printf("%d years is %d days", age, days);




}

}