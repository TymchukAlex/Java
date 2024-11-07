import java.util.Objects;
import java.util.ArrayList;

/**
 * Represents a student with personal information.
 */
public class Student extends Group {
    private final String firstName;
    private final String lastName;
    private final String birthDate;
    private final String studentId;

    public Student(String groupNumber, int creationYear, String department, String curatorFirstName, String curatorLastName,
                   String firstName, String lastName, String birthDate, String studentId) {
        super(groupNumber, creationYear, department, curatorFirstName, curatorLastName, new ArrayList<>());
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(birthDate, student.birthDate) &&
                Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthDate, studentId);
    }

    // Геттери для доступу до полів
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getStudentId() {
        return studentId;
    }
}
