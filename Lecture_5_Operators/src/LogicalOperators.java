public class LogicalOperators {
    public static void main(String[] args) {

        int p = 23;
        int q = 67;
        int r = 65;

        System.out.println((p<q ) && (q>r)); //true
        System.out.println((p<q) || (q>p)); //true
        System.out.println(!(p<q)); //false


    }
}
