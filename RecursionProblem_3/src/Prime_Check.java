//46. Create a program using for to display if a number is prime or not.
import java.util.Scanner;

public class Prime_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;
        if (num <= 1) isPrime = false;
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) System.out.println(num + " is prime.");
        else System.out.println(num + " is not prime.");
    }
}
