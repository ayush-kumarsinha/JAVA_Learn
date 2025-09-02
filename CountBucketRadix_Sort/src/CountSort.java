public class CountSort {
    static int findMax(int[] arr){
        int mx = Integer. MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }
    static void basicCountSort(int[] arr){
        int mx = findMax(arr);
        int[] count = new int[mx+1];
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }
        int k = 0;
        for(int i = 0; i < count.length; i++){
            for(int j = 0; j < count[i]; j++){
                arr[k++] = i;
            }
        }
    }
    static void display(int[] a){
        for(int val : a){
            System.out.println(val + " ");
        }
        System.out.println();
    }

    static void countSort(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        int max = findMax(arr);
        int[] count = new int[max+1];
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }
        for(int i = 1; i < arr.length; i++){
            count[i] += count[i-1];
        }
        for(int i = n-1; i >= 0; i--){
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;

            }
        }




    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 2, 5};
        basicCountSort(arr);
        display(arr);
    }
}





