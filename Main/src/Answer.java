// print the Smallest and largest element.

import java.util.Scanner;
import java.util.Arrays;

public class Answer {
    static int[] smallestAndLargestElement(int[] arr) {
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]};
        return ans;

    // This syntex use for short the element

    }
    static boolean isSorted(int[] arr){
        boolean check = true;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                // not sorted
                check = false;
                break;
            }
        }
        return check;
    }
    static int lastOccurrence(int[] arr, int x){
        int lastIndex = -1;
        for(int i = 0; i < arr.length; i++){
            /*
            i = 0
            arr[0] < arr[-1]
            */

            if (arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter" + n + " element: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
//        System.out.println("Enter x");
//        int x = sc.nextInt();
//        System.out.println("COUNT OF X: "  + TryThis.countOccurrences(arr, x));
//        System.out.println("Last OCCURRENCE OF X: " + lastOccurrence(arr, x ));
//        System.out.println("IS Sorted " + isSorted(arr));

      int[] ans = smallestAndLargestElement(arr);
        System.out.println("Smallest: " + ans[0]);
        System.out.println("Largest: " + ans[1]);

    }
}
