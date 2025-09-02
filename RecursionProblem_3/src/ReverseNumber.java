//31. Create a program to reverse the digits of a number
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append digit to reversed number
            number /= 10; // Remove last digit from number
        }

        System.out.println("Reversed number: " + reversedNumber);
        scanner.close();
    }
}
