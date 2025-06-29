import java.util.ArrayList;
import java.util.List;

class Student extends Person {
    private List<Course> enroledcourse=new ArrayList<>();
    public Student(String name, String email, String id) {
        SetName(name);
        setEmail(email);
        setId(id);
    }
public void enrollInCourse(Course course) {
     if (course.registerStudent(this)){
         enroledcourse.add(course);
     }
    }

   public void dropCourse(Course course) {
        enroledcourse.remove(course);
    }
    @Override
    public  void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Student");
        System.out.println("Enrolled Courses:");
        for (Course c : enroledcourse) {
            System.out.println("  - " + c.getCourseName());
        }
        System.out.println("---------------------");
    }
}
