 // Calculate the sum of all the element in the given arr.   arr[] = {1,5,3}

 class january{
    void sum(){

        int[] arr = {1,2,3};
        int sum = 0;

        for(int i = 0; i < arr.length ; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

 }

public class TryThis {
    public static void main(String[] args) {
        january obj = new january();
        obj.sum();
    }
}
