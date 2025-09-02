//Find the total no. of pair in array whose sum is equal to the given value X

import java.util.Scanner;

public class Main {
    static int pairSum(int[] arr, int target){
        int n = arr.length;
        int ans = 0;

        for(int i = 0; i < n; i++){ // first no.
            for(int j = i + 1; j < n; j++){  // second no.
                if(arr[i] + arr[j]  == target){
                    ans++;

                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target sum");
        int target = sc.nextInt();

        System.out.println(pairSum(arr, target));

    }
}