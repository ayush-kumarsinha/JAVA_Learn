// Give few lines of input(number of lines unknown) were each lines has two strings, concatenate the string
import java.util.Scanner;
public class concatenateTheString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {

            String a = sc.next();
            String b = sc.next();
            System.out.println(a + b);
        }
    }
}