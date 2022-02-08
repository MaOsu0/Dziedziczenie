package Example2;

public class Boostcamp extends OnlineCourse{
    private String teacherFirstName;
    private String teacherLastName;
    private double houersOfConsultations;

    public String getTeacherFirstName() {
        return teacherFirstName;
    }

    public void setTeacherFirstName(String teacherFirstName) {
        this.teacherFirstName = teacherFirstName;
    }

    public String getTeacherLastName() {
        return teacherLastName;
    }

    public void setTeacherLastName(String teacherLastName) {
        this.teacherLastName = teacherLastName;
    }

    public double getHouersOfConsultations() {
        return houersOfConsultations;
    }

    public void setHouersOfConsultations(double houersOfConsultations) {
        this.houersOfConsultations = houersOfConsultations;
    }
}
