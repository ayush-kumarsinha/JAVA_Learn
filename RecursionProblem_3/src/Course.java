//60. Design a Course class.
//• Instance variables: courseName, enrolledStudents.
//• Static variable: maxCapacity, the maximum number of students for any course.
//• Instance methods: enrollStudent(String studentName), unenrollStudent(String studentName).
//• Static method: setMaxCap
import java.util.ArrayList;

class Course {
    String courseName;
    ArrayList<String> enrolledStudents = new ArrayList<>();
    static int maxCapacity = 30;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void enrollStudent(String studentName) {
        if (enrolledStudents.size() < maxCapacity) {
            enrolledStudents.add(studentName);
            System.out.println(studentName + " enrolled in " + courseName);
        } else {
            System.out.println("Course is full.");
        }
    }

    public void unenrollStudent(String studentName) {
        enrolledStudents.remove(studentName);
        System.out.println(studentName + " unenrolled from " + courseName);
    }

    public static void setMaxCapacity(int cap) {
        maxCapacity = cap;
    }

    public static void main(String[] args) {
        Course c = new Course("Java Programming");
        c.enrollStudent("Ayush");
        c.enrollStudent("Rahul");
        c.unenrollStudent("Ayush");
        setMaxCapacity(50);
        System.out.println("Max capacity: " + maxCapacity);
    }
}
