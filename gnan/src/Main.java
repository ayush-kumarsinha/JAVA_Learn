// Create a program to input name of the person and respond with Welcome NAME to Skill Development Training//
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read user input

        System.out.println("Welcome " + name + " to Skill Development Training");

    }
}
