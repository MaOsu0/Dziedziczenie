package Example2;

public class CourseTest {
    public static void main(String[] args) {
        OnlineCourse online = new OnlineCourse();
        online.setIndex(6);
        online.setName("Kurs JavaStart Online");
        online.setDescription("Najlepszy kurs programowania w Javie");
        online.setPrice(299);
        online.setVideoMinutesInCourse(600);
        online.setEstimateCourseLenght(1200);
        System.out.println("Informacje o kursie " + online.getName());
        System.out.println("Opis: " + online.getDescription());
        System.out.println("Cena: " + online.getPrice() + "zł");
        System.out.println("Identyfikator: " + online.getIndex());
        System.out.println("Czas filmów w kursie: " + online.getVideoMinutesInCourse() + "min");
        System.out.println("Czas potrzebny na przerobienie: " + online.getEstimateCourseLenght() + "min");
    }
}
