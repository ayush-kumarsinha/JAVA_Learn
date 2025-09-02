//54. Create a class Student with attributes name and age. Use a constructor to initialize these attributes and print
//the student details.
class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s = new Student("Ayush", 20);
        s.printDetails();
    }
}
