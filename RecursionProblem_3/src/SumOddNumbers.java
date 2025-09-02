//25. Create a program to sum all odd numbers from 1 to a specified number N.
import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i += 2) {
            sum += i;
        }

        System.out.println("Sum of all odd numbers from 1 to " + N + " is: " + sum);

        scanner.close();
    }
}

