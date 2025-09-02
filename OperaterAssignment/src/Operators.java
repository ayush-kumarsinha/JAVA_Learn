import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // Q. no. 1;
//        int x  = sc.nextInt();
//        System.out.println((((x + 8) / 3 ) % 5 ) * 5);

        // Q.NO. 2;

//        int x = sc.nextInt();
//        int y = sc.nextInt();
//
//        x = x + y;
//        y = x - y;
//        x = x - y;
//
//        System.out.println(x);
//        System.out.println(y);

        // Q.no. 4;

//        int a = 55;
//        int b = 70;
//        System.out.println(a < 50 && a < b); // true
//        System.out.println(a < 50 | a < b);  // true

        int x = sc.nextInt();
        int sum = 0;
        while( x > 0 ){
            sum = sum + x % 10;
            x = x / 10;
        }
        System.out.println(sum);


    }
}
