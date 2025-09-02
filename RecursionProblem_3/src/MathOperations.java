//56. Create a class MathOperations with two add() methods:  (method overloading)
//One adds two integers.
class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MathOperations mo = new MathOperations();
        System.out.println("Add 2: " + mo.add(5, 3));
        System.out.println("Add 3: " + mo.add(5, 3, 2));
    }
}
