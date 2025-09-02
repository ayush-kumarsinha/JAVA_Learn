// Remove all the Occurrence of 'a' from string s = "abcax"
// O/P is bcx

import java.util.Scanner;
public class RemoveOccurrences {
    // dbacx ---> dbcx
    static String removeA(String s, int idx){
        // base case
        if(idx == s.length()) return "";
        // recursive work
        String smallAns = removeA(s, idx+1);  // bcx
        char currChar = s.charAt(idx);

      //  self work
        if(currChar != 'a'){
          return currChar + smallAns;  // d + bcx
        } else{
            return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeA(s, 0));
    }
}
