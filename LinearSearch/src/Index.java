// Given an array of size N and an integer x. the task is to find all the indices of the integer X in.
// I/O = {1,2,3,2,2,5} , x = 2
// O/p = 1 3 4

public class Index {
    static void findAllIndices(int[] a,int n, int target, int idx){  // 1,2,3,2,2
        // base case
        if(idx >= n){
            return;
        }
        //self work
        if(a[idx] == target){
            System.out.println(idx);
        }
        //recursive work
        findAllIndices(a, n, target, idx+1);
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 4, 4, 5, 6 };
        int target = 4;
        int n = a.length;
       findAllIndices(a, n, target,0);
    }
}

// find all arr list