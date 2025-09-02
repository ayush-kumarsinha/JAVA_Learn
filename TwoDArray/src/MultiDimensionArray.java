public class MultiDimensionArray {

    static void printArray(int[][] arr){
        for(int i = 0; i < arr.length; i++){  // row
//            System.out.println(arr[i]);
            for(int j = 0; j < arr[i].length; j++){  // coloumn
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {

        // this is the reprersentation of arr

//       int[][]  arr = new int[2][3];
//       arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[1][0] = 3;
//        arr[1][1] = 4;
//        arr[2][0] = 5;
//        arr[0][2] = 6;

        // other method of arr

        int[][] arr2 = {
                {1, 2, 3},
                {12, 23, 45},
                {9, 8, 6}
        };

        printArray(arr2);


    }
}
