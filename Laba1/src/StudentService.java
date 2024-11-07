import java.util.List;
import java.util.stream.Collectors;

public class StudentService {

    // Метод для сортування студентів за прізвищем
    public List<Student> sortStudentsByLastName(List<Student> students) {
        return students.stream()
                .sorted((s1, s2) -> s1.getLastName().compareTo(s2.getLastName()))
                .collect(Collectors.toList());
    }

    // Метод для отримання студентів за номером групи
    public List<Student> getStudentsByGroupNumber(List<Student> students, String groupNumber) {
        return students.stream()
                .filter(student -> student.getGroupNumber().equals(groupNumber))
                .collect(Collectors.toList());
    }

    // Метод для отримання студентів, народжених після певної дати
    public List<Student> getStudentsBornAfter(List<Student> students, String date) {
        return students.stream()
                .filter(student -> student.getBirthDate().compareTo(date) > 0)
                .collect(Collectors.toList());
    }
}