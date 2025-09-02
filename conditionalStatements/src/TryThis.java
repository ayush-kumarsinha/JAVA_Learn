import java.util.Scanner;
public class TryThis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

//        if(value % 2 == 0 && value % 3 == 0) {
//            System.out.println( "Found ans -" + value);
//        }


        // Write a program to the value if it is divided by 3 or 5.

        if(value % 3== 0 || value % 5== 0) {
           System.out.println( "Found ans -" + value);
        }


    }
}
