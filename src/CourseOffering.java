import java.util.ArrayList;

/**
 * Created 3/8/18.
 */
public class CourseOffering {

    private Course course;
    private String year;
    private String term;
    private ArrayList<Session> sessions;

    public CourseOffering(Course course, String year, String term) {
        this.course = course;
        this.year = year;
        this.term = term;
        this.sessions = new ArrayList<>();
    }

    public void addSession(Session session) {
        sessions.add(session);
    }

    public Course getCourse() {
        return course;
    }

    public void setCourseCode(Course course) {
        this.course = course;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public boolean hasOffering(String year, String term) {
        return this.year.equals(year) && this.term.equals(term);
    }

    @Override
    public String toString() {
        return "CourseOffering{" +
                "courseCode='" + course + '\'' +
                ", year='" + year + '\'' +
                ", term='" + term + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object otherObj) {

        if (this == otherObj) return true;
        if (otherObj == null) return false;
        if (getClass() != otherObj.getClass()) return false;
        CourseOffering co = (CourseOffering)otherObj;
        return (this.course.equals(co.course) && this.term.equals(co.term) && this.year.equals(co.year));

    }
}
