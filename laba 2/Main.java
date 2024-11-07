import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення студентів, які є частиною групи
        Student student1 = new Student("Група 101", 2023, "Комп'ютерні науки", "Олександр", "Іванов",
                "Тарас", "Шевченко", "2007-01-15", "S001");

        Student student2 = new Student("Група 101", 2023, "Комп'ютерні науки", "Олександр", "Іванов",
                "Олена", "Бджілка", "2007-02-20", "S002");

        Student student3 = new Student("Група 101", 2023, "Комп'ютерні науки", "Олександр", "Іванов",
                "Андрій", "Шевченко", "2007-03-10", "S003");

        Student student4 = new Student("Група 102", 2023, "Електроніка", "Наталія", "Петрівна",
                "Рух", "Генадієнко", "2007-04-05", "S004");

        Student student5 = new Student("Група 102", 2023, "Електроніка", "Наталія", "Петрівна",
                "Роман", "Герасименко", "2007-05-25", "S005");

        // Створення групи
        List<Student> group1Students = new ArrayList<>(Arrays.asList(student1, student2, student3));
        List<Student> group2Students = new ArrayList<>(Arrays.asList(student4, student5));

        Group group1 = new Group("Група 101", 2023, "Комп'ютерні науки", "Олександр", "Іванов", group1Students);
        Group group2 = new Group("Група 102", 2023, "Електроніка", "Наталія", "Петрівна", group2Students);

        // Виведення інформації про групи
        System.out.println("Інформація про групу 1:");
        System.out.println(group1);
        System.out.println("\nІнформація про групу 2:");
        System.out.println(group2);

        // Успішність студентів у групі 1 за допомогою Builder
        List<Performance> performancesGroup1 = new ArrayList<>();
        performancesGroup1.add(new Performance.Builder()
                .groupNumber("Група 101")
                .creationYear(2023)
                .department("Комп'ютерні науки")
                .curatorFirstName("Олександр")
                .curatorLastName("Іванов")
                .firstName("Іван")
                .lastName("Шевченко")
                .birthDate("2000-01-15")
                .studentId("S001")
                .subject("Програмування")
                .teacher("Петро Петров")
                .date("2024-05-01")
                .grade(90)
                .build());
        
        performancesGroup1.add(new Performance.Builder()
                .groupNumber("Група 101")
                .creationYear(2023)
                .department("Комп'ютерні науки")
                .curatorFirstName("Олександр")
                .curatorLastName("Іванов")
                .firstName("Олена")
                .lastName("Коваленко")
                .birthDate("2000-02-20")
                .studentId("S002")
                .subject("Математика")
                .teacher("Ірина Іванова")
                .date("2024-05-02")
                .grade(85)
                .build());
        
        performancesGroup1.add(new Performance.Builder()
                .groupNumber("Група 101")
                .creationYear(2023)
                .department("Комп'ютерні науки")
                .curatorFirstName("Олександр")
                .curatorLastName("Іванов")
                .firstName("Андрій")
                .lastName("Сидоренко")
                .birthDate("2000-03-10")
                .studentId("S003")
                .subject("Фізика")
                .teacher("Олег Олексійов")
                .date("2024-05-03")
                .grade(88)
                .build());

        // Успішність студентів у групі 2 за допомогою Builder
        List<Performance> performancesGroup2 = new ArrayList<>();
        performancesGroup2.add(new Performance.Builder()
                .groupNumber("Група 102")
                .creationYear(2023)
                .department("Електроніка")
                .curatorFirstName("Наталія")
                .curatorLastName("Петрівна")
                .firstName("Марія")
                .lastName("Петренко")
                .birthDate("2000-04-05")
                .studentId("S004")
                .subject("Хімія")
                .teacher("Светлана Сергіївна")
                .date("2024-05-04")
                .grade(92)
                .build());
        
        performancesGroup2.add(new Performance.Builder()
                .groupNumber("Група 102")
                .creationYear(2023)
                .department("Електроніка")
                .curatorFirstName("Наталія")
                .curatorLastName("Петрівна")
                .firstName("Сергій")
                .lastName("Герасименко")
                .birthDate("2000-05-25")
                .studentId("S005")
                .subject("Біологія")
                .teacher("Марина Миколаївна")
                .date("2024-05-05")
                .grade(87)
                .build());

        // Виведення успішності
        System.out.println("\nУспішність студентів групи 1:");
        for (Performance performance : performancesGroup1) {
            System.out.println(performance.getFirstName() + " " + performance.getLastName() + ": " + performance);
        }

        System.out.println("\nУспішність студентів групи 2:");
        for (Performance performance : performancesGroup2) {
            System.out.println(performance.getFirstName() + " " + performance.getLastName() + ": " + performance);
        }
    }
}
