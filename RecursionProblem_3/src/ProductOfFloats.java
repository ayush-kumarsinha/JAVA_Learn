//5. Create a program to calculate product of two floating points numbers.//
import java.util.Scanner;

public class ProductOfFloats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first floating-point number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter second floating-point number: ");
        float num2 = scanner.nextFloat();

        // Calculating the product
        float product = num1 * num2;

        // Displaying the result
        System.out.println("Product: " + product);

        scanner.close();
    }
}

