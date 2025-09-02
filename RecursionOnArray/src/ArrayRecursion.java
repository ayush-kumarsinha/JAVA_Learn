// Find the MAX element of the array

public class ArrayRecursion {
//    static void printArray(int[] arr, int idx){  // 5, 6 , 7 , 8
//        // base case
//        if(idx == arr.length){
//            return;
//        }
//        // self work
//        System.out.println(arr[idx]);  // 5
//        // recursive work -  sub problem
//        printArray(arr, idx+1);  // 6 , 7 , 8

        static int maxInArray(int[] arr, int idx){
            // base case
            if(idx == arr.length-1){
                return arr[idx];
            }
            // small problem -> idx+1, end of the array -> max -> recursive
            int smallAns = maxInArray(arr, idx+1);

            // self work and final ans
            return Math.max(arr[idx], smallAns);
        }



    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8,17, 9};
     //   printArray(arr, 0);
        System.out.println(maxInArray(arr, 0));
    }
}
