package Example2;

public class OnlineCourse extends Course{
    private double videoMinutesInCourse;
    private double estimateCourseLenght;

    public double getVideoMinutesInCourse() {
        return videoMinutesInCourse;
    }

    public void setVideoMinutesInCourse(double videoMinutesInCourse) {
        this.videoMinutesInCourse = videoMinutesInCourse;
    }

    public double getEstimateCourseLenght() {
        return estimateCourseLenght;
    }

    public void setEstimateCourseLenght(double estimateCourseLenght) {
        this.estimateCourseLenght = estimateCourseLenght;
    }
}
