import org.w3c.dom.ls.LSOutput;
import pw.skills.App;
public class OutSide {
    public static void main(String[] args) {
        App obj = new App();
        System.out.println("Outside package, non - child class: " + obj.str_1);

        App obj3 = new App3();
    }
}
