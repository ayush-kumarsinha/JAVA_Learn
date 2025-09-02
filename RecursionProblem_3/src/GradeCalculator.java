//Create a program that calculates grades based on marks
//A -> above 90%
//B -> above 75%
//C -> above 60%
//D -> above 30%
//F -> below 30%
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks (out of 100): ");
        int marks = scanner.nextInt();

        char grade = calculateGrade(marks);

        System.out.println("Your grade is: " + grade);

        scanner.close();
    }

    public static char calculateGrade(int marks) {
        if (marks > 90) {
            return 'A';
        } else if (marks > 75) {
            return 'B';
        } else if (marks > 60) {
            return 'C';
        } else if (marks > 30) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

