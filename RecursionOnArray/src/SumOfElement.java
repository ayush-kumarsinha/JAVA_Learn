public class SumOfElement {
    static int sumOfArray(int[] arr, int idx){
        // base case
        if(idx == arr.length){
            return 0;
        }
        // recursive work - subproblem
        int smallAns = sumOfArray(arr, idx+1);

         // self work
        return smallAns + arr[idx];
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 9};
        System.out.println(sumOfArray(arr, 0));

    }
}
