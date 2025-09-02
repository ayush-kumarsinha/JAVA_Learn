import java.util.*;
class Operation
{
    void push(Stack<Integer>stack,int a)
    {
        stack.push(a);
    }
    void pop(Stack<Integer> stack)
    {
        int ele=(Integer)stack.pop( );
        System.out.println("The popped element:"+ele);
    }
    void peek(Stack<Integer> stack)
    {
        int ele=(Integer)stack.peek( );
        System.out.println("The top element of the stack:"+ele);
    }
    void search(Stack<Integer>stack,int a)
    {
        int pos=(Integer)stack.search(a);
        if(pos==0)
            System.out.println("Element not found");
        else
            System.out.println("Element is found in the position"+pos);
    }
}
class StackExample
{
    public static void main(String[ ] args)
    {
        Stack<Integer> stack= new Stack<Integer>( );
        Scanner in=new Scanner(System.in);
        Operation ob=new Operation( );
        int ch,data;
        do
        {
            System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Search\n5.Exit\nEnter the choice:");
            ch=in.nextInt( );
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the data");
                    data=in.nextInt( );
                    ob.push(stack,data);
                    System.out.println("Elements in the stack:"+stack);
                    break;
                case 2:
                    ob.pop(stack);
                    System.out.println("Elements in the stack:"+stack);
                    break;
                case 3:
                    ob.peek(stack);
                    break;
                case 4:
                    System.out.println("Enter the data to be searched");
                    data=in.nextInt( );
                    ob.search(stack,data);
                    break;
                case 5:
                    ch=0;
                    break;
                default:
                    System.out.println("Enter the proper choice");
            }
        }while(ch>0);
    }}
