// Erite a java method to compute the average of three number
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the three numbers:");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//         int avg = (a+b+c)/3;
//        System.out.print(avg(a ,b ,c));
//    }
//
//    public static int avg(int a, int b, int c){
//        return (a+b+c)/3;

        //Write a java program to colculate the string to count the vowel latter

        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println(Count(s));
    }

    public static int Count(String s){
        int Count  = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                Count++;
            }
            }
            return Count;
        }

    }

