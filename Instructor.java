import java.util.ArrayList;
import java.util.List;

// Inheritance: Instructor is a subclass of Person
class Instructor extends Person {
    // Encapsulation: List to store the courses assigned to this instructor
    private List<Course> assignedCourse = new ArrayList<>();

    // Constructor: Initialize instructor's name, email, and ID using superclass methods
    public Instructor(String name, String email, String id) {
        SetName(name);     // Set the instructor's name (assumed method in Person)
        setEmail(email);   // Set the instructor's email (assumed method in Person)
        setId(id);         // Set the instructor's ID (assumed method in Person)
    }

    // Method to assign a course to the instructor
    public void assigneCourse(Course course) {
        // Avoid duplicate assignments
        if (!assignedCourse.contains(course)) {
            assignedCourse.add(course); // Add course to list if not already assigned
        }
    }

    // Method overriding: Display instructor details along with assigned courses
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call displayDetails() from Person class
        System.out.println("Role: Instructor");
        System.out.println("Assigned Courses:");
        // Loop through and display all assigned course names
        for (Course c : assignedCourse) {
            System.out.println("  - " + c.getCourseName()); // Assumes Course class has getCourseName() method
        }
    }
}
