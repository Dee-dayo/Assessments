import java.util.Scanner;

public class DayOfWeek {

public static void main(String[] args) {

Scanner input = new Scanner (System.in);

System.out.print("Enter year: (e.g., 2012): ") ;
int year = input.nextInt() ;
int yearOfCentury = year % 100;

int century = year / 100 ;

System.out.print("Enter month:");
int month = input.nextInt() ;

System.out.print("Enter the day of the month: 1 - 31: ");
int dayOfMonth = input.nextInt() ;

int dayOfWeek;

dayOfWeek = (dayOfMonth + (26 * (month + 1) / 10) + yearOfCentury + (yearOfCentury / 4) + (century/4) + (5*century) )% 7 ;

if (dayOfWeek == 0) System.out.print("Day of the week is Saturday");
if (dayOfWeek == 1) System.out.print("Day of the week is Sunday");
if (dayOfWeek == 2) System.out.print("Day of the week is Monday");
if (dayOfWeek == 3) System.out.print("Day of the week is Tuesday");
if (dayOfWeek == 4) System.out.print("Day of the week is Wednesday");
if (dayOfWeek == 5) System.out.print("Day of the week is Thursday");
if (dayOfWeek == 6) System.out.print("Day of the week is Friday");

}


}