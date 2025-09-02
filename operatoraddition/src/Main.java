import java.util.*;
class Operation {
    void enqueue(java.util.Queue<Integer> queue, int a){
        queue.add(a);
    }
    void dequeue(java.util.Queue<Integer> queue){
        int ele=(Integer)queue.poll();
        System.out.println("The popped element:" +ele);
    }
    void peek(Queue<Integer> queue){
        int ele=(Integer)queue.peek();
        System.out.println("The head of the queue:" +ele);

    }

}

class  QueueExample{
    public static void main(String[ ] args){
        Queue<Integer>  queue= new LinkedList<Integer>( );
        Scanner  in=new Scanner(System.in);
        Operation ob=new Operation( );
        int  ch,data,value;
        do{
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Peek\n4.Exit\nEnter the choice:");
            ch=in.nextInt( );
            switch(ch){
                case 1:
                    System.out.println("Enter the data");
                    data=in.nextInt( );
                    ob.enqueue(queue,data);
                    System.out.println("Elements in the queue:"+queue);
                    break;
                case 2:
                    ob.dequeue(queue);
                    System.out.println("Elements in the queue:"+queue);
                    break;
                case 3:
                    ob.peek(queue);
                    break;
                case 4:
                    ch=0;
                    break;
                default:
                    System.out.println("Enter the proper choice ");

            }

        }
        while(ch>0);
    }

}



