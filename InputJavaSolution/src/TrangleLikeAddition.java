//  Give two numbers, return there sum in the following int t representing number of tesx cases T lines of two integers respresenting the number to be added
import java.util.Scanner;

public class TrangleLikeAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for( int i = 1; i <= t; i ++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);

        }

    }
}
