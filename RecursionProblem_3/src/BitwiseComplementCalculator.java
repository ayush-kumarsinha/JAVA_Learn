//20. Create a program that shows bitwise compliment of a number.
import java.util.Scanner;

public class BitwiseComplementCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int result = ~num;

        System.out.println("Bitwise complement of " + num + " is: " + result);

        scanner.close();
    }
}

