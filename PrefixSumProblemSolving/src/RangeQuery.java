// Give an arr of integerv of size n. answer q quaries where you need to print the sum if valye in a given range of indices from L to R (both included)
// note : value of L and R in quaries follow 1-based

import java.util.Scanner;
public class RangeQuery {
    static int[] makePrefixSumArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }

        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter array size");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // this is the coll the method

            int[] prefSum = makePrefixSumArray(arr);

            System.out.println("Enter number of queries:");
            int q = sc.nextInt();
            while (q-- > 0) {
                System.out.println("Enter range");
                int l = sc.nextInt();
                int r = sc.nextInt();

                int ans = prefSum[r] - prefSum[l-1];

                System.out.println("Sum:" + ans);

            }

        }

    }




