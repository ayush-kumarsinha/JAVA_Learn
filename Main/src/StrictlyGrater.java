// Count the no. of element strictly grater then valur of X.

import java.util.Scanner;
public class StrictlyGrater {
    static int lastOccurrence(int[] arr, int x){
        int lastIndex = -1;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > x){
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
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("COUNT OF X: "  + TryThis.countOccurrences(arr, x));
        System.out.println("Last OCCURRENCE OF X: " + lastOccurrence(arr, x ));

    }
}



