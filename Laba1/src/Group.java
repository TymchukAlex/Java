import java.util.List;
import java.util.Objects;

/**
 * Represents a group of students.
 */
public class Group {
    private final String groupNumber;
    private final int creationYear;
    private final String department;
    private final String curatorFirstName;
    private final String curatorLastName;
    private final List<Student> students;

    public Group(String groupNumber, int creationYear, String department, String curatorFirstName, String curatorLastName, List<Student> students) {
        this.groupNumber = groupNumber;
        this.creationYear = creationYear;
        this.department = department;
        this.curatorFirstName = curatorFirstName;
        this.curatorLastName = curatorLastName;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupNumber='" + groupNumber + '\'' +
                ", creationYear=" + creationYear +
                ", department='" + department + '\'' +
                ", curatorFirstName='" + curatorFirstName + '\'' +
                ", curatorLastName='" + curatorLastName + '\'' +
                ", students=" + students +
                '}';
    }

    // Геттери для доступу до полів
    public String getGroupNumber() {
        return groupNumber;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public String getDepartment() {
        return department;
    }

    public String getCuratorFirstName() {
        return curatorFirstName;
    }

    public String getCuratorLastName() {
        return curatorLastName;
    }

    public List<Student> getStudents() {
        return students;
    }
}