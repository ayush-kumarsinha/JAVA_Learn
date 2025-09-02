import java.io.*;
import java.util.Scanner;
public class LinerSearch {
    public static void main(String[] args) {
        int i, n, data, array[ ];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        n = in.nextInt( );
        array = new int[n];
        for (i = 0;i< n; i++)
        {
            System.out.println("Enter the element:"+(i+1));
            array[i] = in.nextInt( );
        }
        System.out.println("Enter value to find");
        data = in.nextInt( );
        for (i = 0; i< n; i++)
        {
            if (array[i] == data)
            {
                System.out.println(data + " is present at location " + (i+ 1) );
                break;
            }
        }
        if (i== n)
            System.out.println(data +" is not present in the array");


    }
}
