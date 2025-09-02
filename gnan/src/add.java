//2. Create a program to add two numbers.//
import java.util.Scanner;
public class add {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num1, num2, sum;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        sum = num1 + num2;

        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}

