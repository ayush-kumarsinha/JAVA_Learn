//26.  Write a function that calculates the factorial of a given number
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        System.out.println(n < 0 ? "Factorial is not defined for negative numbers." : "Factorial of " + n + " is: " + factorial(n));
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }
}
