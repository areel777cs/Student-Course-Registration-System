import java.util.ArrayList;
import java.util.List;

// Inheritance: Student is a subclass of Person
class Student extends Person {
    // Encapsulation: List to store courses the student is enrolled in
    private List<Course> enroledcourse = new ArrayList<>();

    // Constructor: Initializes student attributes using setters from Person class
    public Student(String name, String email, String id) {
        SetName(name);     
        setEmail(email);   
        setId(id);         
    }

    // Method to enroll the student in a course
    public void enrollInCourse(Course course) {
        // First, try to register this student in the course
        if (course.registerStudent(this)) {
            // If registration is successful, add course to enrolled list
            enroledcourse.add(course);
        }
    }

    // Method to drop a course from the student's enrolled list
    public void dropCourse(Course course) {
        enroledcourse.remove(course); // Removes course (if present)
    }

    // Method overriding: Display student details along with enrolled courses
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call displayDetails() from the Person superclass
        System.out.println("Role: Student");
        System.out.println("Enrolled Courses:");
        // Loop through each enrolled course and print its name
        for (Course c : enroledcourse) {
            System.out.println("  - " + c.getCourseName()); // Assumes getCourseName() exists in Course class
        }
        System.out.println("---------------------");
    }
}
