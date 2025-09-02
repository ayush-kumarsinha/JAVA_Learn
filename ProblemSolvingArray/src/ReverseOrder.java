import java.io.OptionalDataException;

public class ReverseOrder {
   static void printArray(int[] arr) {
       int i;
       for (i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
       }
       System.out.println();
   }
   static int[] reverseArray(int[] arr) {
       int n = arr.length;
       int[] ans = new int[n];
       int j = 0;

       // traverse original arr in reverse direction
//       for(int i = n-1; i >= 0; i--) {
//           ans[j++] = arr[i];
//       }

       // using for while looop
       int i = n-1;
       while(i >= 0){
           ans[j++] = arr[i--];
       }
       return ans;
   }
    


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] ans = reverseArray(arr);
       printArray(ans);
        }


}





