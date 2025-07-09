package Task_4.HashMap_student;

import java.util.HashMap;

public class StudentGrades {
    static HashMap<String, Integer> grades = new HashMap<>();

    public static void addStudent(String name, int grade) {
        grades.put(name, grade);
    }

    public static void removeStudent(String name) {
        grades.remove(name);
    }

    public static void getGrade(String name) {
        if (grades.containsKey(name)) {
            System.out.println(name + "'s grade: " + grades.get(name));
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void main(String[] args) {
        addStudent("Ravi", 90);
        addStudent("Kiran", 88);
        getGrade("Ravi");
        removeStudent("Kiran");
        getGrade("Kiran");
    }
}
