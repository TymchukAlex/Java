import java.util.List;
import java.util.stream.Collectors;

public class GroupService {

    // Метод для сортування груп за номером
    public List<Group> sortGroupsByNumber(List<Group> groups) {
        return groups.stream()
                .sorted((g1, g2) -> g1.getGroupNumber().compareTo(g2.getGroupNumber()))
                .collect(Collectors.toList());
    }

    // Метод для отримання студентів за кафедрою
    public List<Student> getStudentsByDepartment(List<Group> groups, String department) {
        return groups.stream()
                .filter(group -> group.getDepartment().equals(department))
                .flatMap(group -> group.getStudents().stream())
                .collect(Collectors.toList());
    }

    // Метод для знаходження групи за прізвищем куратора
    public Group findGroupByCuratorLastName(List<Group> groups, String curatorLastName) {
        return groups.stream()
                .filter(group -> group.getCuratorLastName().equals(curatorLastName))
                .findFirst()
                .orElse(null);
    }
}