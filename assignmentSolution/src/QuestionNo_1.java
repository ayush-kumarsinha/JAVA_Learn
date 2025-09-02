//  Q. NO.- 1 - write a program to add 8 to the number X and then divided it by 3. now the modulus of the guotient is taken with 5 and then multiply the resulant value by 5. Display the final result

import java.util.Scanner;
public class QuestionNo_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        System.out.println((((x + 8) / 3) % 5) * 5 );


        // Q.NO, - 2 - Swap two numbers without the use of third variable

//        System.out.println("Enter the first number");
//        int x = sc.nextInt();
//        System.out.println("Enter the second number");
//        int y = sc.nextInt();
//
//        x = x + y ;
//        y = x - y ;
//        x = x - y ;
//        System.out.println(x);
//        System.out.println(y);

        // Q. NO. - 3 - Write a program to calculate the sum of the digits of a 3 - digit number

//        int x = sc.nextInt();
//        int sum = 0;
//        while( x > 0 ){
//            sum = sum + x % 10;  // sum +=  x % 10;
//            x = x / 10;  // x /= 10;
//
//        }
//        System.out.println(sum);

       // Q. NO. - 4 - Assign values of variables "a" nad "b" as 55 and 70 respectively and check it:
        // 1) Both the conditions 'a < 50' and 'a < b' are true.
        // 2) At least one of the conditions 'a < 50' or 'a < b' is true

        // this code we are not need for taking input
//
//        int a = 55;
//        int b = 70;
//        System.out.println(a < 50 && a < b);  // false
//        System.out.println( a < 50 || a < b); // true

        // Q. no. - 5 - Find total number of bits needed to be flipped to covert x to y.

        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = x ^ y;
        int count = 0;
        while (n != 0){
            n = n & (n - 1);
            count++;
        }
        System.out.println(count);
    }
}
