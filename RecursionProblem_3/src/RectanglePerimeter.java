//6. Create a program to calculate Perimeter of a rectangle. Perimeter of rectangle ABCD = A+B+C+D  //
import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of side A: ");
        float A = scanner.nextFloat();

        System.out.print("Enter length of side B: ");
        float B = scanner.nextFloat();

        System.out.print("Enter length of side C: ");
        float C = scanner.nextFloat();

        System.out.print("Enter length of side D: ");
        float D = scanner.nextFloat();

        float perimeter = A + B + C + D;

        System.out.println("Perimeter of the rectangle: " + perimeter);

        scanner.close();
    }
}

