import java.util.Scanner;
public class Multiplication {

    static void printMatrix(int[][] matrix) {

    }

    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("multiplication not possible - wrong dimension ");
            return;
        }

        int[][] mul = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                   /*
                   i = 1, j = 0

                   mul[i][j] = ith row of a * jth col of b
                   */
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("Multiplication of 2 matrices");
        printMatrix(mul);
    }



        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of rows");
            int r = sc.nextInt();
            System.out.println("Enter number of columns");
            int c = sc.nextInt();

            int[][] a = new int[r][c];

            System.out.println("Enter" + r * c + "element");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    a[i][j] = sc.nextInt();

                }
            }
            System.out.println("Enter number of rows and columns of matrix 1");
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();
            int[][] b = new int[r2][c2];
            System.out.println("Enter matrix values");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    b[i][j] = sc.nextInt();

                }
            }
            System.out.println("Matrix 1");
            printMatrix(a);
            System.out.println("Matrix 2");
            printMatrix(b);

   //         add(a, r1, c1, b, r2, c2);
            multiply(a, r, c, b, r2, c2);
        }

    }

