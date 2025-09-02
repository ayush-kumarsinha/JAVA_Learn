//32. Create a program to print the Fibonacci series up to a certain number.
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit for Fibonacci series: ");
        int limit = scanner.nextInt();

        int first = 0, second = 1;
        System.out.print("Fibonacci Series: " + first + ", " + second);

        int next = first + second;
        while (next <= limit) {
            System.out.print(", " + next);
            first = second;
            second = next;
            next = first + second;
        }

        scanner.close();
    }
}
