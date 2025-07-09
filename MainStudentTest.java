package Task_4.Student_Management;

public class MainStudentTest {
    public static void main(String[] args) {
        try {
            Student s = new Student(101, "Ramesh", 20, "CS");
            System.out.println("Student created successfully!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
