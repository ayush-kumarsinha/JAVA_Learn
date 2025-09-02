// Given an array of integers ' a ', move all the even integers
// at the beginning if the array by all the ODD integer .
// the relative order of ODD or even integers does not matter return any
// array that satisfied the condition
import java.util.Scanner;

public class EvenAndOddShort {
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
}
static void sortArrayByParity(int[] arr){
        int n = arr.length;

        int left = 0, right =  n-1;

        while(left < right){
         if(arr[left] % 2 == 1 && arr[right] % 2 == 0){
             swap(arr, left, right);
             left++;
             right--;
         }
         if(arr[left] % 2 == 0){

         }
         if(arr[right] % 2 == 1){
             right--;
         }
        }
    }
    static void sortZeroesAndOnes(int[] arr) {
        int n = arr.length;

        int left = 0, right = n - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left++;

            }
            if (arr[right] == 1) {
                right--;
            }
        }

    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " Element ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: ");
        printArray(arr);
     //   sortZeroesAndOnes(arr);
      sortArrayByParity(arr);


        System.out.println("sorted array: ");
        printArray(arr);
    }
}



