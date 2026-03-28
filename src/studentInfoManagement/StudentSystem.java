package studentInfoManagement;

import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ObtainInfo studentManager = new ObtainInfo();
        boolean running = true;

        System.out.println("=== Student Management System ===");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a new student");
            System.out.println("2. Display all students");
            System.out.println("3. Update a student");
            System.out.println("4. Delete student by index");
            System.out.println("5. Delete student by name");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    studentManager.addStudent();
                    break;
                case 2:
                    studentManager.displayAllStudents();
                    break;
                case 3:
                    studentManager.updateStudent();
                    break;
                case 4:
                    studentManager.deleteStudent();
                    break;
                case 5:
                    studentManager.deleteStudentByName();
                    break;
                case 6:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
        studentManager.closeScanner();
    }
}
