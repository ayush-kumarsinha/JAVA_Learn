// count the number of triples whose sum is equal to the given value X
import java.util.Scanner;
public class tripletSum {
    static int tripleSum(int[] arr, int target){
      int ans  =0;
      int n  = arr.length;

      for(int i = 0; i < n; i++){  // first no.
          for(int j = i+1; j < n; j++){ // second no.
              for(int k = j+1; k < n; k++){  // third no.
                  if(arr[i] + arr[j] + arr[k] == target){
                      ans++;
                  }

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

        System.out.println(tripleSum(arr, target));


    }
        }
