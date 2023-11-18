import java.util.Scanner;

public class PerimeterOfTriangle {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter side A: ");
int firstEdge = input.nextInt() ;

System.out.print("Enter side B: ");
int secondEdge = input.nextInt() ;

System.out.print("Enter side C: ");
int thirdEdge = input.nextInt() ;

if (firstEdge + secondEdge > thirdEdge && firstEdge + thirdEdge > secondEdge && secondEdge + thirdEdge > firstEdge) 
{
System.out.print("The input is valid \n");
int perimeter = firstEdge + secondEdge + thirdEdge ;
System.out.printf("The perimeter is %d", perimeter);
}

if (firstEdge + secondEdge <= thirdEdge || firstEdge + thirdEdge <= secondEdge || secondEdge + thirdEdge <= firstEdge) {
System.out.print("The input is invalid \n");
}


}


}