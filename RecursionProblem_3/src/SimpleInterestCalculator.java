//8. Create a program to calculate simple interest.  //
import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        float principal = scanner.nextFloat();

        System.out.print("Enter annual interest rate (in percentage): ");
        float rate = scanner.nextFloat();

        System.out.print("Enter time (in years): ");
        float time = scanner.nextFloat();

        float simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + simpleInterest);

        scanner.close();
    }
}

