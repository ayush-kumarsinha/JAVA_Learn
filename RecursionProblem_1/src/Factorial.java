// find the factorial of N numbers.

public class Factorial {

    static int factorial(int n){
        // base case
        if(n == 0) return 1;

        // smaller problem - recursive work

        int smallerAns = factorial(n-1); // factorial (4) = 24

        // big problem - self work
        int ans = n * smallerAns;
        return ans;

    }
    public static void main(String[] args) {

        System.out.println(factorial(4));
    }
}
