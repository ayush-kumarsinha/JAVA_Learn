//  Q. no. 1 - input name , roll no. and field of interest from user and the  formrt below : Name: XYZ , roll number: XYZ, Field of interest XYZ.

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ReadingInput {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    String first_name = sc.next();
    String last_name = sc.next();
    int roll_number = sc.nextInt();
    String field_of_interest = sc.next();
        System.out.println("Name:" + first_name +"" + last_name);
        System.out.println("Roll Number;" + roll_number);
        System.out.println("Field of interest:" + field_of_interest);

    }
}
