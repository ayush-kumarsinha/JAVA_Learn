//52. Create a program using recursion to display the Fibonacci series up to a certain number.
public class Fibonacci_Series {
    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int limit = 10;
        for (int i = 0; i < limit; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
