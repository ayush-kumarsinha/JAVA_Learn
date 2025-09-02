/*
Find the square root of the given non negative value . Round it off to the nearest floor
integer value .
I/P : x = 4
o/p : 2

i/p : x = 11
O/P : 3
 */

public class FindSquareRoot {
    static int sqrt(int x ){
        int st = 0, end = x;
        int ans = -1;
        while(st <= end){
            int mid = st + (end-st)/2;
            int val = mid * mid;
            if(val == x){
                return mid;
            } else if(val < x){
                ans = mid;
                st = mid+1;
            } else {
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 24;
        System.out.println(sqrt(x));

    }
}
