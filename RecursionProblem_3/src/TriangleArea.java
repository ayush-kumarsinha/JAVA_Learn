//7. Create a program to calculate the Area of a Triangle. Area of triangle = ½*B*H  //
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        float base = scanner.nextFloat();

        System.out.print("Enter the height of the triangle: ");
        float height = scanner.nextFloat();

        float area = 0.5f * base * height;

        System.out.println("Area of the triangle: " + area);

        scanner.close();
    }
}

