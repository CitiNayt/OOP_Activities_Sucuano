// Jessrell Sucuano
// BSIT-2B
// November 5, 2026

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(
            "Ana Cruz", "STU001", "BSIT", 2
        );

        Student student2 = new Student(
            "Mark Reyes", "STU002", "BSCS", 1
        );

        CollegeStudent student3 = new CollegeStudent(
            "Lea Santos", "STU003", "BSIT", 3,
            "Full Scholar"
        );

        System.out.println("===== STUDENT INFORMATION =====");
        student1.displayInfo();

        System.out.println();

        student2.displayInfo();

        System.out.println();

        System.out.println("===== COLLEGE STUDENT =====");
        student3.displayInfo();

        System.out.println("\n===== UPDATED INFORMATION =====");

        student1.setYearLevel(4);

        student1.displayInfo();

    }
}

/*
 * REFLECTION QUESTIONS
 *
 * 1. Why should the attributes of Student be private instead of public?
 *
 * Answer: Making the attributes private keeps the student's
 *         information safe and prevents direct changes from
 *         other classes.
 *
 * 2. What would happen if CollegeStudent did not call super(...) in its constructor?
 *
 * Answer: The program would show a compilation error because
 *         the Student class needs its constructor to be called
 *         before CollegeStudent can be created.
 *
 * 3. What is the benefit of overriding displayInfo() instead of writing a new method with a different name?
 *
 * Answer: It allows CollegeStudent to use the same method name
 *         while showing additional details specific to
 *         college students.
 */