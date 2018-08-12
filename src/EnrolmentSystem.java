import java.util.ArrayList;

public class EnrolmentSystem {

    private ArrayList<Course> courses;
    private ArrayList<Student> students;
    private ArrayList<Enrolment> enrolments;
    private ArrayList<CourseOffering> courseOfferings;


    public EnrolmentSystem() {
        courses = new ArrayList<Course>();
        students = new ArrayList<Student>();
        enrolments = new ArrayList<Enrolment>();
        courseOfferings = new ArrayList<CourseOffering>();
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void addCourseOffering(CourseOffering courseOffering) {
        courseOfferings.add(courseOffering);
    }

    public void addEnrolment(Enrolment e){
        enrolments.add(e);
    }

    public String displayCourses() {
        StringBuilder sb = new StringBuilder();
        sb.append("Courses are:\n");
        for (Course course : courses) {
            sb.append(course.toString()).append("\n");
        }
        String result = new String(sb);
        System.out.println(result);
        return result;
    }

    public void displayCourseOfferings(String year, String term) {
        System.out.println("Offerings are:\n");
        for (CourseOffering course : courseOfferings) {
            if (course.getYear().equals(year) && course.getTerm().equals(term)) {
                System.out.println(course.toString());
            }
        }
    }

    public ArrayList<CourseOffering> listCourseOfferings(String year, String term) {
        ArrayList<CourseOffering> offerings = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("Offerings are:\n");
        for (CourseOffering course : courseOfferings) {
            sb.append(course.toString()).append("\n");
        }
        String result = new String(sb);
        System.out.println(result);
        return courseOfferings;
    }


    public Enrolment enrolStudent(Student student, CourseOffering co) {
        int check = 0;
        for (Course course : co.getCourse().getPre_req()) {
            int i = 0;
            check = 0;
            while (i < student.getCompleted().size()){
                if (course.equals(student.getCompleted().get(i))) {
                    check++;
                }
                i++;
            }
            if (check == 0){
                System.out.println("Pre-requisites not met for" + " " + co.getCourse().getCourseCode() + "!\n");
                return null;
            }
        }
        System.out.println("Enrolled into" + " " + co.getCourse().getCourseCode());
        Enrolment e = new Enrolment(co);
        student.addEnrolment(e);
        return e;
    }

}