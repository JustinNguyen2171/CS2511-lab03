import java.util.ArrayList;

/**
 * Created 3/8/18.
 */
public class Student {

    private String zid;
    private ArrayList<Enrolment> enrolments;
    private ArrayList<Course> courses;
    private ArrayList<Course> completed;

    public Student(String zid) {
        this.zid = zid;
        enrolments = new ArrayList<>();
        courses = new ArrayList<>();
        completed = new ArrayList<>();
    }

    /**
     * Add an enrolment.
     * @param e
     */
    public void addEnrolment(Enrolment e) {
        this.enrolments.add(e);
    }

    public void addCompleted(Course c) {
        this.completed.add(c);
    }

    public ArrayList<Enrolment> getEnrolments() {
        return enrolments;
    }

    public ArrayList<Course> getCompleted(){
        return completed;
    }

    /**
     * @return the zid
     */
    public String getZid() {
        return zid;
    }

    /**
     * Print out all the students enrolments.
     */
    public void displayEnrolments() {
        StringBuilder sb = new StringBuilder();
        sb.append("Enrolments are:\n");
        for (Enrolment enrolment : enrolments) {
            sb.append(enrolment.toString()).append("\n");
        }
        String result = new String(sb);
        System.out.println(result);
    }

    @Override
    public String toString() {
        return "Student{" +
                "zid='" + zid + '\'' +
                '}';
    }
}