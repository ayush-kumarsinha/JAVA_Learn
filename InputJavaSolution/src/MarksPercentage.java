// Q. no. - 3 - If the marks of rober in three subject are entered through keyboard(each out of 100), write a program to calculate his marks and percentage marks
import java.util.Scanner;
public class MarksPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks_1 = sc.nextInt();
        int marks_2 = sc.nextInt();
        int marks_3 = sc.nextInt();
        int total_marks = marks_1 + marks_2 + marks_3 ;
         int percentage = (total_marks / 3);
        System.out.println(total_marks);
        System.out.println(percentage + "%");

    }
}
