//27. Create a program that computes the sum of the digits of an integer.
import java.util.Scanner;
public class SumOfDigitsCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Sum of digits of " + n + " is: " + sumOfDigits(Math.abs(n)));
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

