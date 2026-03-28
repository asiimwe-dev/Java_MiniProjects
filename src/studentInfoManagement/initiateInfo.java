package studentInfoManagement;

public class initiateInfo {
    private String name;
    private int age;
    private double gpa;

    // Default constructor
    public initiateInfo() {
    }

    // Parameterized constructor
    public initiateInfo(String name, int age, double gpa) {
        this.setName(name);
        this.setAge(age);
        this.setGPA(gpa);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGPA() {
        return gpa;
    }

    // Setters
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Name can't be empty! Please enter a name.");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative!");
        } else {
            this.age = age;
        }
    }

    public void setGPA(double gpa) {
        if (gpa < 0.00 || gpa > 5.00) {
            System.out.println("GPA must be between 0.00 and 5.0!");
        } else {
            this.gpa = gpa;
        }
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", gpa=" + gpa + "}";
    }
}