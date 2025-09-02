//39. Create a program to find the minimum of two numbers.
import java.util.Scanner;

public class MinOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int min = (a < b) ? a : b;

        System.out.println("Minimum is: " + min);
        scanner.close();
    }
}

