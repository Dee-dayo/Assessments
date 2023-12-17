import java.util.Scanner;

public class Flipper {

public static void main(String[] args) {

Scanner flipper = new Scanner(System.in);

System.out.print("Enter number: ");
int num = flipper.nextInt() ;

if (num == 0) System.out.println("1") ;

if (num == 1) System.out.print("0") ;

}


}