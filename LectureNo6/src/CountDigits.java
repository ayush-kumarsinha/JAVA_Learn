// count the no (This code only count 10 digits)

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int numOfDigits = 0;

        while(n > 0) {
            n = n / 10;
            numOfDigits++; // numOfDigits = numOfDigits + 1
        }
        System.out.println("Number of digits in  " + n + " = " +numOfDigits );



    }
}
