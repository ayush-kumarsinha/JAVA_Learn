//22. Create a program that shows use of right shift operator.S
public class RightShiftExample {
    public static void main(String[] args) {
        int num = 20; // Binary representation: 0001 0100
        int shiftBy = 2;

        int result = num >> shiftBy; // Right shift by 2 positions

        System.out.println("Original number: " + num);
        System.out.println("Binary representation: " + Integer.toBinaryString(num));
        System.out.println("After right shift by " + shiftBy + " positions: " + result);
        System.out.println("Binary representation after shift: " + Integer.toBinaryString(result));
    }
}

