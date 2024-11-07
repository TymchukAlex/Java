import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Тарас", "Шевченко", "2007-01-15", "S001", "Група 101");
        Student student2 = new Student("Олена", "Бджілка", "2007-02-20", "S002", "Група 101");
        Student student3 = new Student("Андрій", "Шевченко", "2007-03-10", "S003", "Група 101");
        Student student4 = new Student("Роман", "Герасименко", "2007-05-25", "S004", "Група 102");
        Student student5 = new Student("Марія", "Петренко", "2007-04-05", "S005", "Група 102");

        Group group1 = new Group("Група 101", 2023, "Комп'ютерні науки", "Олександр", "Іванов", new ArrayList<>(Arrays.asList(student1, student2, student3)));
        Group group2 = new Group("Група 102", 2023, "Електроніка", "Наталія", "Петрівна", new ArrayList<>(Arrays.asList(student4, student5)));

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);
        List<Group> groups = Arrays.asList(group1, group2);

        StudentService studentService = new StudentService();
        GroupService groupService = new GroupService();

        System.out.println("Сортування студентів за прізвищем:");
        studentService.sortStudentsByLastName(students).forEach(System.out::println);

        System.out.println("\nСтуденти з групи 101:");
        studentService.getStudentsByGroupNumber(students, "Група 101").forEach(System.out::println);

        System.out.println("\nСтуденти, народжені після 2007-02-01:");
        studentService.getStudentsBornAfter(students, "2007-02-01").forEach(System.out::println);

        System.out.println("\nСортування груп за номером:");
        groupService.sortGroupsByNumber(groups).forEach(System.out::println);

        System.out.println("\nСтуденти кафедри Електроніка:");
        groupService.getStudentsByDepartment(groups, "Електроніка").forEach(System.out::println);

        System.out.println("\nГрупа з куратором Іванов:");
        System.out.println(groupService.findGroupByCuratorLastName(groups, "Іванов"));
    }
}