package studentInfoManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class ObtainInfo {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<initiateInfo> students = new ArrayList<>();

    // Add a new student to the ArrayList
    public void addStudent() {
        System.out.println("Enter student name:");
        String name = scanner.nextLine();

        System.out.println("Enter student age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter student GPA (0.0 - 5.0):");
        double gpa = scanner.nextDouble();
        scanner.nextLine();

        initiateInfo newStudent = new initiateInfo(name, age, gpa);
        students.add(newStudent);
        System.out.println("Student added successfully: " + newStudent);
    }

    
    // Delete a student from the ArrayList
    public void deleteStudent() {
        if (students.isEmpty()) {
            System.out.println("No students to delete!");
            return;
        }

        displayAllStudents();
        System.out.println("Enter the index of the student to delete (0 to " + (students.size() - 1) + "):");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= students.size()) {
            System.out.println("Invalid index!");
            return;
        }

        initiateInfo removed = students.remove(index);
        System.out.println("Deleted student: " + removed);
    }

    // Delete a student by name
    public void deleteStudentByName() {
        if (students.isEmpty()) {
            System.out.println("No students to delete!");
            return;
        }

        System.out.println("Enter the name of the student to delete:");
        String name = scanner.nextLine();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equalsIgnoreCase(name)) {
                initiateInfo removed = students.remove(i);
                System.out.println("Deleted student: " + removed);
                return;
            }
        }
        System.out.println("Student with name '" + name + "' not found!");
    }

    // Display all students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }

        System.out.println("\n--- All Students ---");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(i + ": " + students.get(i));
        }
        System.out.println("--------------------\n");
    }

    // Update a student's info using setters
    public void updateStudent() {
        if (students.isEmpty()) {
            System.out.println("No students to update!");
            return;
        }

        displayAllStudents();
        System.out.println("Enter the index of the student to update (0 to " + (students.size() - 1) + "):");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= students.size()) {
            System.out.println("Invalid index!");
            return;
        }

        initiateInfo student = students.get(index);

        System.out.println("Enter new name (or press Enter to keep current: " + student.getName() + "):");
        String name = scanner.nextLine();
        if (!name.isEmpty()) {
            student.setName(name);
        }

        System.out.println("Enter new age (or -1 to keep current: " + student.getAge() + "):");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (age != -1) {
            student.setAge(age);
        }

        System.out.println("Enter new GPA (or -1 to keep current: " + student.getGPA() + "):");
        double gpa = scanner.nextDouble();
        scanner.nextLine();
        if (gpa != -1) {
            student.setGPA(gpa);
        }

        System.out.println("Student updated: " + student);
    }

    // Get the students ArrayList
    public ArrayList<initiateInfo> getStudents() {
        return students;
    }

    // Close scanner
    public void closeScanner() {
        scanner.close();
    }
}
