//51. Create a program using continue to print only even numbers using continue for odd numbers.
public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                continue; // Skip odd numbers
            }
            System.out.println(i);
        }
    }
}
