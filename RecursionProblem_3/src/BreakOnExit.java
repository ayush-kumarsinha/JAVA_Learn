//49. Create a program using break to read inputs from the user in a loop and break the loop if a specific keyword
//(like "exit") is entered.
import java.util.Scanner;

public class BreakOnExit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter something (type 'exit' to quit): ");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) break;

            System.out.println("You entered: " + input);
        }

        System.out.println("Exited the loop.");
    }
}
