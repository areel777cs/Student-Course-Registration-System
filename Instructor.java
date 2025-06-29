import java.util.ArrayList;
import java.util.List;

class Instructor extends Person {
    private List<Course> assignedCourse= new ArrayList<>();
    public Instructor(String name, String email, String id) {
        SetName(name);
        setEmail(email);
        setId(id);
    }
   public void assigneCourse(Course course){
        if (!assignedCourse.contains(course)){
            assignedCourse.add(course);
        }
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Instructor");
        System.out.println("Assigned Courses:");
        for (Course c : assignedCourse) {
            System.out.println("  - " + c.getCourseName());
        }
    }
}