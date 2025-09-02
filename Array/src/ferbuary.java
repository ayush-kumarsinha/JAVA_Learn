// Find the max numbers.
class march{
    void maxOfArray(){
        int[] arr = {5,67,8,3,8,9};  // ans = 67

        int ans = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        System.out.println("max" +ans);

    }
}

public class ferbuary {
    public static void main(String[] args) {
        march obj = new march();
        obj.maxOfArray();
    }
}
