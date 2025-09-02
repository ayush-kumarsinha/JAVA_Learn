//23. Write a program to check if a given number is even or odd using bitwise operators.
public class EvenOddCheck {
    public static void main(String[] args) {
        int num = 10; // Change this number to test other values

        if ((num & 1) == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}
