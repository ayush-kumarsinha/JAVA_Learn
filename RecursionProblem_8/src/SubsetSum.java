// Given an array of integer , print sums of all subsets in it . Output sums can be printed in
// I/P = arr[] = {2,3}
// O/P = 0 2 3 5
// I/P = arr []= {2,4,5}
// O/P = 0 2 4 6 7 9 11
public class SubsetSum {
    static void subsetSum(int[] a, int n, int idx, int sum){
        if(idx >= n){
            System.out.println(sum);
            return;
        }
        // curr idx + sum
        subsetSum(a, n, idx+1, sum + a[idx]);
        // curr ans
        subsetSum(a, n, idx+1, sum);

    }
    public static void main(String[] args) {
        int[] a = {2, 4, 5};
        subsetSum(a, a.length, 0, 0);

    }
}
