//17. Create a program that shows bitwise AND of two numbers.
import java.util.Scanner;

public class BitwiseAndCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int result = num1 & num2;

        System.out.println("Bitwise AND of " + num1 + " and " + num2 + " is: " + result);

        scanner.close();
    }
}

