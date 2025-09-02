import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // print n natural number

        int n = sc.nextInt();

//        for(int num = 1; num <=n; num++){
//            System.out.println(num);
//        }

        // print sum of n natural number

//        int sum = 0;
//
//            for (int num = 1; num <= n; num++){
//            sum = sum + num;
//        }
//        System.out.println(sum);

        //print n natural number of reverse order

        for(int num = n; num >= 1; num--) {
            System.out.println(num);
        }
    }

}