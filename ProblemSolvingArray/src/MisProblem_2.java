// Given 2 Integer a and b . swap the 2 given value using sum and differencee method
public class MisProblem_2 {
    static void swapWithoutTemp(int a, int b){
        System.out.println("Original value before swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        a = a +b;
        b = a - b;
        a  = a - b;

        System.out.println("Values after swap");
        System.out.println("a:" + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        int a = 9;
         int b = 3;
          int[] arr = {1, 2, 3, 4, 5,};
        swapWithoutTemp( a, b);
    }
}
