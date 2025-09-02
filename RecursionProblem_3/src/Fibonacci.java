//32. Create a program to print the Fibonacci series up to a certain number.
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit number: ");
        int limit = scanner.nextInt();

        int a = 0, b = 1;

        System.out.print("Fibonacci Series up to " + limit + ": ");

        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        scanner.close();
    }
}

