import java.util.ArrayList;
import java.util.List;
// Course class represents a course with students registered in it
class Course {
    // Encapsulated fields for course information
    private String courseCode, courseName;
    private int maxStudents;

    // List to keep track of students registered in this course
    private List<Student> registeredStudents = new ArrayList<>();

    // Constructor to initialize course attributes
    public Course(String courseCode, String courseName, int maxStudents) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxStudents = maxStudents;
    }

    // Getter method for course code
    String getCourseCode() {
        return courseCode;
    }

    // Getter method for course name
    String getCourseName() {
        return courseName;
    }

    // Method to register a student in the course
    public boolean registerStudent(Student student) {
        // Only register if the student isn't already registered and max limit isn't reached
        if (registeredStudents.size() < maxStudents && !registeredStudents.contains(student)) {
            registeredStudents.add(student);
            return true; // Registration successful
        }
        return false; // Registration failed (duplicate or full)
    }

    // Method to remove a student from the course
    public boolean removeStudent(Student student) {
        return registeredStudents.remove(student); // Returns true if removed
    }

    // Display method to print course details and registered students
    void displayCourseInfo() {
        System.out.println("Course: " + courseCode + " - " + courseName);
        System.out.println("Enrolled Students (" + registeredStudents.size() + "/" + maxStudents + "):");
        // Print each student's name (assumes getName() exists in Student/Person)
        for (Student s : registeredStudents) {
            System.out.println("  - " + s.getName());
        }
    }
}
