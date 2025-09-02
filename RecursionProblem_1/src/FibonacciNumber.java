// Problem to find nth fibonacci number.

public class FibonacciNumber {

    static int fib(int n ){
        // base cASE
        if(n == 0 || n == 1){
            return n;
        }
        // subProblem;
        int prev = fib(n-1);
        int prevPrev = fib(n-2);
        // self work

        // return fib(n:n-1) + fib(n:n-2);
        
        return prev + prevPrev;


    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
    }
}
