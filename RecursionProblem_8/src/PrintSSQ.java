// Given a string , write a method to print all its subsequences
public class PrintSSQ {
    static void printSSQ(String s, String CurrAns){
        if(s.length() == 0){
            System.out.println(CurrAns);
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);
        // curr char  --> chooses to be a part of currAns
        printSSQ(remString, CurrAns + curr);  // bc, a
        // curr char --> does not choose to be a part of currAns
        printSSQ(remString, CurrAns);  // bc, ""

    }

    public static void main(String[] args) {
        printSSQ("abc" , "");

    }
}

