//Create a program that categorize a person into different age groups
//Child -> below 13
//Teen -> below 20
//Adult -> below 60
//Senior-> above 60
import java.util.Scanner;

public class AgeGroupClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String category = categorizeAge(age);

        System.out.println("You belong to the age group: " + category);

        scanner.close();
    }

    public static String categorizeAge(int age) {
        if (age < 13) {
            return "Child";
        } else if (age < 20) {
            return "Teen";
        } else if (age < 60) {
            return "Adult";
        } else {
            return "Senior";
        }
    }
}

