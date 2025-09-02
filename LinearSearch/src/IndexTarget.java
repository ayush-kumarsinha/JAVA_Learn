// find first INDEX --> return index of target if target present in array , otherwise return -1
public class IndexTarget {
    static int findIndex(int[] a, int n, int target, int idx){
        // base case
        if(idx >= n)return -1;
        // self work
        if(a[idx] == target) return idx;
        // recursive work
        return findIndex(a, n, target, idx+1);
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 4, 5, 6 };
        int target = 4;
        int n = a.length;
        System.out.println(findIndex(a, n, target, 0));

    }
}

// Given an array of size N and an integer x. the task is to find all the indices of the integer X in.
// I/O = {1,2,3,2,2,5} , x = 2
// O/p = 1 3 4