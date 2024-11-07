import java.util.ArrayList; // Import for ArrayList
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating Student objects using the Builder pattern
        Student student1 = new Student.Builder()
                .setFirstName("Тарас")
                .setLastName("Шевченко")
                .setBirthDate("2007-01-15")
                .setStudentId("S001")
                .setGroupNumber("Група 101")
                .build();

        Student student2 = new Student.Builder()
                .setFirstName("Олена")
                .setLastName("Бджілка")
                .setBirthDate("2007-02-20")
                .setStudentId("S002")
                .setGroupNumber("Група 101")
                .build();

        Student student3 = new Student.Builder()
                .setFirstName("Андрій")
                .setLastName("Шевченко")
                .setBirthDate("2007-03-10")
                .setStudentId("S003")
                .setGroupNumber("Група 101")
                .build();

        Student student4 = new Student.Builder()
                .setFirstName("Роман")
                .setLastName("Герасименко")
                .setBirthDate("2007-05-25")
                .setStudentId("S004")
                .setGroupNumber("Група 102")
                .build();

        Student student5 = new Student.Builder()
                .setFirstName("Марія")
                .setLastName("Петренко")
                .setBirthDate("2007-04-05")
                .setStudentId("S005")
                .setGroupNumber("Група 102")
                .build();

        // Creating Group objects using the Builder pattern
        Group group1 = new Group.Builder()
                .setGroupNumber("Група 101")
                .setCreationYear(2023)
                .setDepartment("Комп'ютерні науки")
                .setCuratorFirstName("Олександр")
                .setCuratorLastName("Іванов")
                .setStudents(new ArrayList<>(Arrays.asList(student1, student2, student3)))
                .build();

        Group group2 = new Group.Builder()
                .setGroupNumber("Група 102")
                .setCreationYear(2023)
                .setDepartment("Електроніка")
                .setCuratorFirstName("Наталія")
                .setCuratorLastName("Петрівна")
                .setStudents(new ArrayList<>(Arrays.asList(student4, student5)))
                .build();

        // Creating a list of students and groups
        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);
        List<Group> groups = Arrays.asList(group1, group2);

        // Creating service objects
        StudentService studentService = new StudentService();
        GroupService groupService = new GroupService();

        // Testing StudentService methods
        System.out.println("Сортування студентів за прізвищем:");
        studentService.sortStudentsByLastName(students).forEach(System.out::println);

        System.out.println("\nСтуденти з групи 101:");
        studentService.getStudentsByGroupNumber(students, "Група 101").forEach(System.out::println);

        System.out.println("\nСтуденти, народжені після 2007-02-01:");
        studentService.getStudentsBornAfter(students, "2007-02-01").forEach(System.out::println);

        // Testing GroupService methods
        System.out.println("\nСортування груп за номером:");
        groupService.sortGroupsByNumber(groups).forEach(System.out::println);

        System.out.println("\nСтуденти кафедри Електроніка:");
        groupService.getStudentsByDepartment(groups, "Електроніка").forEach(System.out::println);

        System.out.println("\nГрупа з куратором Іванов:");
        System.out.println(groupService.findGroupByCuratorLastName(groups, "Іванов"));

        // Testing invalid group creation to trigger validation exception
        try {
            Group invalidGroup = new Group.Builder()
                    .setGroupNumber("Група 103")
                    .setCreationYear(1899) // This should throw an exception
                    .setDepartment("Математика")
                    .setCuratorFirstName("Петро")
                    .setCuratorLastName("Сидоренко")
                    .setStudents(new ArrayList<>(Arrays.asList(student1)))
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("\nException occurred while creating group: " + e.getMessage());
        }
    }
}
