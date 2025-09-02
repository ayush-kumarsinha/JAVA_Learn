// Search theh gevem element X in the array. if present then return the index else return  -1.
// input:arr[] = {1,5,3}     X = 5  o/p = 1
class December{
    void searchInArray(){
        int[] arr = {10, 5, 3, 6, 2, 8, 4};
        int x = 2;
        int ans = -1;
        for(int i  =0; i < arr.length; i++){
            if(arr[i] == x){
                ans = i;
                break;  // repeated value easse print nahi hoga
            }
        }
        if(ans == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Found" +x+ "at index" + ans);
        }


    }

}

public class presentState {
    public static void main(String[] args) {
        December obj = new December();
        obj.searchInArray();

    }
}
