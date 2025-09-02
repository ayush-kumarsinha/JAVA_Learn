//48. Create a program using for-each to the occurrences of a specific element in an array.
public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 2, 9, 2, 4};
        int target = 2;
        int count = 0;

        for (int num : arr) {
            if (num == target) count++;
        }

        System.out.println("Occurrences of " + target + ": " + count);
    }
}
