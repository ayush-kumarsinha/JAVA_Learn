public class SumOfDigits{
    static int SumOfDigits(int n){
        // base case
        if(n >= 0 && n <= 9){
         return n;

        }
        // recursive work - small ans
        int smallAns = SumOfDigits(n/10);

        // self work
        int ans = smallAns +n%10;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(SumOfDigits(1234));

    }

}