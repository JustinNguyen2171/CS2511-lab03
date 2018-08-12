import java.util.ArrayList;

public class Course {

    private String courseCode;
    private ArrayList<Course> pre_req;
    private int credit_pnts;
    private static int counter;

    public Course(String courseCode, int credit_pnts) {
        this.courseCode = courseCode;
        this.pre_req = new ArrayList<Course>();
        this.credit_pnts = credit_pnts;
        counter++;
    }


    public void addPrereq(Course course) {
        pre_req.add(course);
    }

    public ArrayList<Course> getPre_req() {
        return pre_req;
    }

    @Override
    public String toString() {
        return courseCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int GetNumCourses(){
        return counter;
    }

}