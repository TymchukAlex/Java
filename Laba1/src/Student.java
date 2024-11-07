import java.util.Objects;

/**
 * Represents a student with personal information.
 */
public class Student {
    private final String firstName;
    private final String lastName;
    private final String birthDate;
    private final String studentId;
    private final String groupNumber;

    public Student(String firstName, String lastName, String birthDate, String studentId, String groupNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.studentId = studentId;
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", studentId='" + studentId + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                '}';
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

    public String getGroupNumber() {
        return groupNumber;
    }
}