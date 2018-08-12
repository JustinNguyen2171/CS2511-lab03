/**
 * Created 3/8/18.
 */
public class Enrolment {

    private CourseOffering offering;
    private String grade;
    private Status status;

    public Enrolment(CourseOffering offering) {
        this.offering = offering;
        this.status = Status.Current;
    }

    public Course getCourse() {
        return offering.getCourse();
    }

    public String getYear() {
        return offering.getYear();
    }

    public String getTerm() {
        return offering.getTerm();
    }


    /**
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return the status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param completed the status to set
     */
    public void setStatus(Status completed) {
        this.status = completed;
    }

    @Override
    public boolean equals(Object otherObj) {

        if (this == otherObj) return true;
        if (otherObj == null) return false;
        if (getClass() != otherObj.getClass()) return false;
        Enrolment e = (Enrolment)otherObj;
        return (this.offering.equals(e.offering));
    }

    @Override
    public String toString() {
        return "Enrolment{" +
                "courseCode='" + offering.getCourse() + '\'' +
                ", year='" + offering.getYear() + '\'' +
                ", term='" + offering.getTerm() + '\'' +
                '}';
    }
}