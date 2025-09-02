class ArraysExample{
    void demoArrays(){
        int[] ages = new int[3];  // ages[0], ages[1] , ages[2]
        float[] weights = new float[5];
        String[] names = {"Ayush" , "raja" , "arti" , "usha"};

        System.out.println(ages.length); //3
        System.out.println(weights.length); //5
        System.out.println(names.length); //4
        ages[0] = 34;
        ages[1] = 56;
        ages[2] = 46;
  //      ages[5] = 69;  // out of bounce
        weights[0] =  34.3f;
        weights[1] =  10.3f;
        weights[2] =  64.3f;

//        System.out.println(ages[0]);
//        System.out.println(ages[1]);
//        System.out.println(ages[2]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
// This the for loog example.
//        for(int i = 0; i < 3; i++){
//            System.out.println(ages[i]);
//        }

        // For Each loops.
//
//        for(int age : ages){
//            System.out.println(age);
//        }

        // this the while loops.

        int i = 0;
        while(i <3){
            System.out.println(ages[i]);
            i++;
        }

    }
}
public class Main {
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
        obj.demoArrays();
    }
}