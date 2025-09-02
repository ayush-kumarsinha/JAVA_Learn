// Given an array arr, move all 0's to the end of it while maintaining the relatine order of the non-zero elements.
// note: that must do this in- place without making a copy of ath array.
// I/P = 0 5 0 3 42
// O/P = 5 3 42 0 0
public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 10, 5, 0, 4};
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] == 0 && arr[j+1] != 0) {
                    // swap arr[j] , arr[j+1]

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}