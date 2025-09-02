import java.util.Scanner;
public class SumMethod_2 {
    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;

        for(int i = l1; i <= l2; i++){
            for(int j = r1; j <= r2; j++){
                sum += matrix[i][j];

            }
        }
        return sum;

    }

    static void findPrefixSumMatrix(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;

        // traverse horizontally to calculate row-wise prefix sum
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] += matrix[i][j-1];

            }

        }
    }
    static int findSum2(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        findPrefixSumMatrix(matrix);
       for(int i = l1; i <= l2; i++){
           // r1 to r2 sum for row i
           if(r1 >= 1)
           sum += matrix[i][r2] - matrix[i][r1-1];
           else
               sum += matrix[i][r2];
       }
       return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r * c;
        System.out.println("Enter " + totalElements + " value");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }

        }
        System.out.println("Enter rectangle boundaries l1, r1, l2, r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle sum (Method 1): " + findSum(matrix, l1, r1, l2, r2));
        System.out.println("Rectangle sum (Method 2)" + findSum2(matrix, l1, r1, l2, r2));

    }
}
