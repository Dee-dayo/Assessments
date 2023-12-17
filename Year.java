import java.util.Scanner ;

public class Year {

public static void main(String[] args) {

Scanner minute = new Scanner(System.in);

System.out.print("Enter the number of minutes: ");
int minutes = minute.nextInt();


int years = minutes / 525600;
int remainderMinutes = minutes % 525600;
int days = remainderMinutes / 1440;


System.out.printf("%d minutes is approximately %d years and %d days", minutes, years, days);

}



}