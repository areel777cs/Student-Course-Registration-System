import java.util.ArrayList;
import java.util.List;

// RegistrationSystem manages students, instructors, and courses
class RegistrationSystem {
    // Lists to store all students, instructors, and courses
    private List<Student> students = new ArrayList<>();
    private List<Instructor> instructors = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    // Method to add a student to the system
    public void addStudent(Student s) {
        students.add(s);
    }

    // Method to add an instructor to the system
    public void addInstructor(Instructor i) {
        instructors.add(i);
    }

    // Method to add a course to the system
    public void addCourse(Course c) {
        courses.add(c);
    }

    // Helper method: Find a student by ID
    private Student findStudentID(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) { // Assumes getId() exists in Person
                return s;
            }
        }
        return null; // Student not found
    }

    // Helper method: Find an instructor by ID
    private Instructor findInstructorID(String id) {
        for (Instructor i : instructors) {
            if (i.getId().equals(id)) { // Assumes getId() exists in Person
                return i;
            }
        }
        return null; // Instructor not found
    }

    // Helper method: Find a course by course code
    private Course findCourseCode(String code) {
        for (Course c : courses) {
            if (c.getCourseCode().equals(code)) { // Assumes getCourseCode() exists
                return c;
            }
        }
        return null; // Course not found
    }

    // Registers a student to a course using student ID and course code
    public void registerStudentToCourse(String studentId, String courseCode) {
        Student student = findStudentID(studentId);
        Course course = findCourseCode(courseCode);
        if (student != null && course != null) {
            student.enrollInCourse(course); // Calls Student's enrollInCourse()
        }
    }

    // Drops a student from a course
    public void dropStudentFromCourse(String studentId, String courseCode) {
        Student student = findStudentID(studentId);
        Course course = findCourseCode(courseCode);
        if (student != null && course != null) {
            student.dropCourse(course); // Calls Student's dropCourse()
        }
    }

    // Assigns an instructor to a course
    public void assignInstructorToCourse(String instructorId, String courseCode) {
        Instructor instructor = findInstructorID(instructorId);
        Course course = findCourseCode(courseCode);
        if (instructor != null && course != null) {
            instructor.assigneCourse(course); // Calls Instructor's assigneCourse()
        }
    }

    // Displays all course registrations and their enrolled students
    public void displayAllRegistrations() {
        for (Course c : courses) {
            c.displayCourseInfo(); // Calls Course's displayCourseInfo()
            System.out.println("-----------------------------");
        }
    }
}
