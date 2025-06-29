import java.util.List;
import java.util.ArrayList;
    public class Main {
        public static void main(String[] args) {
          RegistrationSystem Rs=new RegistrationSystem();
          Student s1=new Student("Areel abbas","areel@email","cs241102");
          Instructor i1=new Instructor("Sir.Junaid","sir@gmail","I001");
          Course c1=new Course("C107","Oop",14);
          Rs.addStudent(s1);
          Rs.addInstructor(i1);
          Rs.addCourse(c1);
          Rs.assignInstructorToCourse("I001","C107");
          Rs.registerStudentToCourse("cs241102","C107");
          Rs.displayAllRegistrations();
          s1.displayDetails();
          i1.displayDetails();

        }

}