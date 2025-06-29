import java.util.ArrayList;
import java.util.List;
 class RegistrationSystem {
     private List<Student> students = new ArrayList<>();
     private List<Instructor> instructors = new ArrayList<>();
     private List<Course> courses = new ArrayList<>();

     public void addStudent(Student s) {
         students.add(s);
     }

     public void addInstructor(Instructor i) {
         instructors.add(i);
     }

     public void addCourse(Course c) {
         courses.add(c);
     }

     private Student findStudentID(String id) {
         for (Student s : students) {
             if (s.getId().equals(id)) {
                 return s;
             }
         }
         return null;
     }

     private Instructor findInstructorID(String id){
         for (Instructor i: instructors){
             if (i.getId().equals(id)){
                 return i;
             }
         }
         return null;
     }
     private Course findCourseCode(String code) {
         for (Course c : courses) {
             if (c.getCourseCode().equals(code)) {
                 return c;
             }
         }
         return null;
     }
public void registerStudentToCourse(String studentId, String courseCode){
         Student student=findStudentID(studentId);
         Course course=findCourseCode(courseCode);
         if (student!=null&&course!=null) {
             student.enrollInCourse(course);
         }
}

public void dropStudentFromCourse(String studentId, String courseCode){
    Student student=findStudentID(studentId);
    Course course=findCourseCode(courseCode);
    if (student != null && course != null) {
        student.dropCourse(course);
    }
}
     public void assignInstructorToCourse(String instructorId, String courseCode) {
         Instructor instructor = findInstructorID(instructorId);
         Course course = findCourseCode(courseCode);
         if (instructor != null && course != null) {
             instructor.assigneCourse(course);
         }
     }

     public void displayAllRegistrations() {
         for (Course c : courses) {
             c.displayCourseInfo();
             System.out.println("-----------------------------");
         }
     }
 }


