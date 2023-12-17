import java.util.Scanner;

public class Greatest {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("First integer: ");
int num1 = input.nextInt();

System.out.print("Second integer: ");
int num2 = input.nextInt();

System.out.print("Third integer: ");
int num3 = input.nextInt();

if (num1 > num2 && num1 > num3){
System.out.print("Num 1 is greater");
}

if (num2 > num1 && num2 > num3){
System.out.print("Num 2 is greater");
}

if (num3 > num2 && num3 > num1){
System.out.print("Num 3 is greater");
}

}


}