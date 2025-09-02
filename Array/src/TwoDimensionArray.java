class TwoDimensionExample{
    void multiArray(){
 //       int[] [] arr_1 = new int[5][3];
        int[][] arr = {{56, 43, 6}, {34, 7, 8}};

        // for loop

        for(int i = 0; i < 2; i++){
            //for(int i = 0; i < arr.length; i++){  // another type of writting
            for(int j = 0; j < 3; j++){
                // for(int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);

            }
        }

//        System.out.println(arr[0][0]); // 56
//        System.out.println(arr[0][1]); //43
//        System.out.println(arr[0][2]);  //6
//
//        System.out.println(arr[1][0]); // 34
//        System.out.println(arr[1][1]); //7
//        System.out.println(arr[1][2]); //8
//
//        System.out.println(arr[2][0]);  //12
//        System.out.println(arr[2][1]); //56
//        System.out.println(arr[2][2]);  //8
    }
}

public class TwoDimensionArray {
    public static void main(String[] args) {
        TwoDimensionExample obj = new TwoDimensionExample();
        obj.multiArray();

    }
}
