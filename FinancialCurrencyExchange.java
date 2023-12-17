import java.util.Scanner;

public class FinancialCurrencyExchange {

public static void main(String[] args) {

Scanner input = new Scanner (System.in);

System.out.print("Enter the exchange rate from dollars to RMB: ");
double exchangeRate = input.nextDouble();

System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
int convert = input.nextInt();

if (convert == 0) {
System.out.print("Enter the dollar amount: ");
double dollarAmount = input.nextInt();

double rmbRate = dollarAmount * exchangeRate;

System.out.printf("$%.0f is %.2f yuan", dollarAmount, rmbRate);

}

if (convert == 1) {
System.out.print("Enter the RMB amount: ");
double rmbAmount = input.nextInt();

double dollarRate = rmbAmount / exchangeRate;

System.out.printf("%.0f yuan is $%.2f", rmbAmount, dollarRate);
}
}

}