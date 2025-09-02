// 35.
// Create a program that print patterns:
public class PatternPrinting {
    public static void main(String[] args) {
        int rows = 5; // You can change this to print more or fewer rows

        // Right Half Pyramid
        System.out.println("Right Half Pyramid:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Reverse Right Half Pyramid
        System.out.println("\nReverse Right Half Pyramid:");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Left Half Pyramid
        System.out.println("\nLeft Half Pyramid:");
        for (int i = 1; i <= rows; i++) {
            // Print spaces first
            for (int j = i; j < rows; j++) {
                System.out.print("  ");
            }
            // Then print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
