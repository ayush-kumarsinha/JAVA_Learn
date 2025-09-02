//9. Create a program to calculate Compound interest.  //
import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for principal, rate, and time
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in percentage): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time (in years): ");
        double time = scanner.nextDouble();

        // Calculating compound interest
        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        // Displaying the result
        System.out.println("Compound Interest: " + compoundInterest);
        System.out.println("Total Amount: " + amount);

        scanner.close();
    }
}
