// Q. no. 1 - Write a program which take the value of lengtn and breath from user and check if it is a sguare or noe

import java.util.Scanner;

public class AssignmentAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter the value of length ");
//        int a = sc.nextInt();
//        System.out.println("Enter the value of breath");
//        int b = sc.nextInt();
//        if(a > b){
//            System.out.println(" It is a rectangle" );
//
//        } else{
//            System.out.println("It is not rectangle");
//        }

        //  Q. no. 2 - Write a program to print absolute value of a number entered by the user
//
//        int a = sc.nextInt();
//        a = -a;
//        System.out.println(a);

        // Q. no. 3 - Write a program to take input from user for cost prise (c.p.) and selling prise (s.p) and calculate profit or loss.

//        System.out.println("Enter the  value of cost prise");
//
//        int cost_prise = sc.nextInt();
//        System.out.println("Enter the value of selling prise");
//        int selling_prise = sc.nextInt();
//
//         int profit = selling_prise - cost_prise;
//        int loss = cost_prise - selling_prise;
//
//        if( selling_prise > cost_prise ){
//            System.out.println("profit" + profit);
//
//        } else {
//            System.out.println("loss" + loss);

        // Q. no. 4 - Write a program to print positive number entered by the user , if user enters a negative number , it is skipped

//        System.out.println("Enter an integer:");
//        int num = sc.nextInt();
//       if(num<0){
//
//            System.out.println("the number is negative and skipped");
//
//        }else{
//            System.out.println("The num is positive");
//        }

        // Q. no. 5 - Create a calculator using switch statement to perform addition , sub. mul. nad divide

//        System.out.println("Enter first numbers");
//        int a  = sc.nextInt();
//        System.out.println("Enter second number");
//        int b = sc.nextInt();

        // Q. no. 6 - Write a program to calculate marks to grade: follow the conversion rule as given below

        System.out.println("Enter your marks");
        int marks = sc.nextInt();
        if (marks >= 90 && marks < 100) {
            System.out.println("Your grade is A+");
        } else {
            if (marks >= 80 && marks < 90) {
                System.out.println("Your grade is A");
            }
            if (marks >= 70 && marks < 80) {
                System.out.println("Your marks is B+");
            } else {
                if (marks >= 60 && marks < 70) {
                    System.out.println("marks is B");
                }
                if (marks >= 50 && marks < 60) {
                    System.out.println("Your marks is c");
                } else {
                    if (marks >= 40 && marks < 50) {
                        System.out.println("marks is D");
                    }
                    if (marks >= 30 && marks < 40) {
                        System.out.println("Your marks is E");
                    } else {
                        if (marks >= 0 && marks < 30) {
                            System.out.println("fail");


                        }
                    }
                }
            }
        }
    }
}
