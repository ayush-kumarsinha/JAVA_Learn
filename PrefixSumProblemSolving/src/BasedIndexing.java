
import java.util.Scanner;
public class BasedIndexing {
    static void printArray(int[] arr) {

        for (int value : arr) {
            System.out.println(value + " ");
        }
        System.out.println();
    }

    // this is a method
    static int[] oneBasedIndexing ( int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];

        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }

        return pref;

    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " element");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input Array");
        printArray(arr);

        // this is the coll the method

        int[] pref = oneBasedIndexing(arr);
        printArray(pref);

    }

}


