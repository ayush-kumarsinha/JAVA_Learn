//47. Create a program using for-each to find the maximum value in an integer array.
public class MaxInArray {
    public static void main(String[] args) {
        int[] numbers = {4, 9, 2, 15, 6, 11};
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) max = num;
        }

        System.out.println("Maximum number: " + max);
    }
}

