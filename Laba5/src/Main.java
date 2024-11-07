import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();

        // Додавання нових студентів
        Student student1 = new Student("Тарас", "Шевченко", "2007-01-15", "S001", "Група 101");
        Student student2 = new Student("Олена", "Бджілка", "2007-02-20", "S002", "Група 101");
        dbManager.addStudent(student1);
        dbManager.addStudent(student2);

        // Отримання всіх студентів
        List<Student> students = dbManager.getAllStudents();
        System.out.println("Список студентів:");
        students.forEach(System.out::println);

        // Оновлення студента (створення нового об'єкта)
        if (!students.isEmpty()) {
            Student updatedStudent = new Student("Артем", students.get(0).getLastName(), students.get(0).getBirthDate(), students.get(0).getStudentId(), students.get(0).getGroupNumber());
            dbManager.updateStudent(students.get(0).getId(), updatedStudent);
        }

        // Видалення студента
        if (!students.isEmpty()) {
            dbManager.deleteStudent(students.get(1).getId());
        }

        // Додавання нових груп
        Group group1 = new Group("Група 101", 2023, "Комп'ютерні науки", "Олександр", "Іванов", new ArrayList<>());
        Group group2 = new Group("Група 102", 2023, "Електроніка", "Наталія", "Петрівна", new ArrayList<>());
        dbManager.addGroup(group1);
        dbManager.addGroup(group2);

        // Отримання всіх груп
        List<Group> groups = dbManager.getAllGroups();
        System.out.println("Список груп:");
        groups.forEach(System.out::println);
    }
}
