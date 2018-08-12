public class EnrolSystemMain {
    public static void main(String[] args) {
        EnrolmentSystem enrolSys = new EnrolmentSystem();

        // Create a course
        Course comp1511 = new Course("COMP1511", 6);
        Course comp1531 = new Course("COMP1531", 6);
        comp1531.addPrereq(comp1511);
        Course comp2521 = new Course("COMP2521", 6);
        comp2521.addPrereq(comp1531);
        comp2521.addPrereq(comp1511);

        // Add your code to create additional test data
        // You will need to:
        // (i)  create course-offerings for each course and sessions to the course-offering
        // (ii) add a student
        // (iii)create an enrolment for the student in COMP1511. The enrolment should succeed as COMP1511 has no pre-requisites
        // (iv) create an enrolment for the student in COMP1531. This enrolment should succeed as COMP1531 has one pre-requisite COMP1511
        //      which the student has completed
        // (v)  create an enrolment for COMP2521. This should fail as pre-requisites are not met.

        //Course offerings
        CourseOffering co = new CourseOffering(comp1511, "2018", "s2");
        enrolSys.addCourseOffering(co);
        CourseOffering co2 = new CourseOffering(comp1531, "2018", "s2");
        enrolSys.addCourseOffering(co2);
        CourseOffering co3 = new CourseOffering(comp2521, "2018", "s2");
        enrolSys.addCourseOffering(co3);

        //Students
        Student student = new Student("z5131032");
        enrolSys.addStudent(student);
        student.addCompleted(comp1511);

        //Adding enrolments
        Enrolment comp1511_e = new Enrolment(co);
        Enrolment comp1531_e = new Enrolment(co2);
        Enrolment comp2511_e = new Enrolment(co3);

        //Enroll the students
        comp1511_e = enrolSys.enrolStudent(student, co);
        if (comp1511_e != null) {
            enrolSys.addEnrolment(comp1511_e);
        }
        comp1531_e = enrolSys.enrolStudent(student, co2);
        if (comp1531_e != null) {
            enrolSys.addEnrolment(comp1531_e);
        }
        comp2511_e = enrolSys.enrolStudent(student, co3);
        if (comp2511_e != null) {
            enrolSys.addEnrolment(comp2511_e);
        }


        // Add courses to the enrolment system
        enrolSys.addCourse(comp1531);
        enrolSys.addCourse(comp2521);
        enrolSys.addCourse(comp1511);

        // Display courses in system
        enrolSys.displayCourses();

        // Display course offerings for a particular semester
        enrolSys.displayCourseOfferings("2018", "s2");
    }
}
