package Task_4.Student_Management;

public class Student {
    int rollNo;
    String name;
    int age;
    String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;

        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("Name is not valid.");
        }
        this.name = name;

        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within range.");
        }
        this.age = age;
        this.course = course;
    }
}
