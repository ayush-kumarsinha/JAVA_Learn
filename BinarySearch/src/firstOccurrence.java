/*
Find the first occurrence of a given element x , given that the given array is sorted. if
no occurrence of x is found then return -1.
I/P = [2, 5, 5, 6, 6, 8, 9 , 9, 9]
 x = 5
 O/P = 1
 */

public class firstOccurrence {
    static int firstOcc(int[] a, int x){
        int n = a.length;
        int st = 0, end = n-1;
        int fo = -1;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(a[mid] == x){
                fo = mid;
                end = end-1;
            } else if(x < a[mid]){
                end = mid-1;
            } else{
                st = mid+1;
            }
        }
        return fo;

    }
    public static void main(String[] args) {
        int[] a = {1, 5, 5, 5, 6, 2, 4};
        int x = 5;
        System.out.println(firstOcc(a,x));

    }
}
