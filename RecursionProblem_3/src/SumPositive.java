//50. Create a program using continue to sum all positive numbers entered by the user; skip any negative
//numbers.
import java.util.Scanner;

public class SumPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers (type -999 to stop):");
        while (true) {
            int num = sc.nextInt();
            if (num == -999) break;

            if (num < 0) continue;

            sum += num;
        }

        System.out.println("Sum of positive numbers: " + sum);
    }
}
