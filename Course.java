import java.util.ArrayList;
import java.util.List;

class Course{
  private String courseCode, courseName;
   private int maxStudents;
    private List<Student> registeredStudents=new ArrayList<>();

    public Course(String courseCode,String courseName,
    int maxStudents){
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.maxStudents=maxStudents;
    }
    String getCourseCode(){
        return courseCode;
    }
    String getCourseName(){
        return courseName;
    }
  public boolean registerStudent(Student student){
       if (registeredStudents.size()<maxStudents&&! registeredStudents.contains(student)){
           registeredStudents.add(student);
       }
       return true;
    }
  public boolean removeStudent(Student student){
         return registeredStudents.remove(student);
    }
    void displayCourseInfo(){
        System.out.println("Course: " + courseCode + " - " + courseName);
        System.out.println("Enrolled Students (" + registeredStudents.size() + "/" + maxStudents + "):");
        for (Student s : registeredStudents) {
            System.out.println("  - " + s.getName());
        }
    }
}