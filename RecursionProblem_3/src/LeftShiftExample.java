//21. Create a program that shows use of left shift operator.
public class LeftShiftExample {
    public static void main(String[] args) {
        int num = 5; // Binary representation: 0000 0101
        int shiftBy = 2;

        int result = num << shiftBy; // Left shift by 2 positions

        System.out.println("Original number: " + num);
        System.out.println("Binary representation: " + Integer.toBinaryString(num));
        System.out.println("After left shift by " + shiftBy + " positions: " + result);
        System.out.println("Binary representation after shift: " + Integer.toBinaryString(result));
    }
}
