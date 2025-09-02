//31. Create a program to reverse the digits of a number.

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;         // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit
            num /= 10;                    // Remove the last digit
        }

        System.out.println("Reversed number: " + reversed);
        scanner.close();
    }
}
