
class January {


    static void changeValue(int a) {

        a *= 100;
        System.out.println("Inside change value" + a);
    }
}
public class PassByValue {
    public static void main(String[] args) {

        int a = 10;
        System.out.println("Before changing value" + a);
        January.changeValue(a);

        System.out.println("After changing value" + a);

    }
}
