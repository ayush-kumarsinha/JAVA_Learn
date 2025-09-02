class December{
//    int a = 10;
//    int b = 5;
    int add(){
        int p = 100;
        int q = 20;
        return p + q ;
    }
    int sub(){
        int p = 65;
        int q = 34;
        return p - q ;
    }

    void demo(){  // this is a methods
        int a = 5;  // 10
        System.out.println(a);
        {
            int b = 10;  // block level ko only block ke ander hi excess kiya j sakta hai bahar nahi
            System.out.println(b);

        }
    //    for(int i = 0; i < 5; i++)

        {
            int b = 100;  // /100
            System.out.println(b);
        }

    }
}



public class BlockLevel {
    public static void main(String[] args) {
        December obj = new December();
        obj.demo();
    }
}
