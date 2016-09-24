package module3.homeworkM3.task3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Course fancing = new Course(new Date(), "Kendo");
        Course dancing = new Course("Olga", 250, "Den");
        Course painting = new Course(new Date(), "Impressionism");
        Course karate = new Course("Helen", 180, "Taras");
        Course calligraphy = new Course(new Date(), "Nakamura");

        Course[] courseTaken = {fancing, dancing, painting, karate, calligraphy};

        Student student = new Student("Olga", "Ruban", 4);
        Student student1 = new Student("Ruban", courseTaken);

        Student student2 = new SpecialStudent("Ruban", courseTaken);
        Student student3 = new SpecialStudent("Olga", "Ruban", 4);
        Student student4 = new SpecialStudent("Olga", "Ruban", 4, 777);

        Student student5 = new CollegeStudent("Olga", "Ruban", 4);
        Student student6 = new CollegeStudent("Ruban", courseTaken);
        Student student7 = new CollegeStudent("Olga", "Ruban", 4, "NAU", 13, 120);
    }
}
