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
    private final int id; // Added field for ID

    public Student(String firstName, String lastName, String birthDate, String studentId, String groupNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.studentId = studentId;
        this.groupNumber = groupNumber;
        this.id = generateId(); // Assume you have a method to generate unique IDs
    }

    // New constructor for updating an existing student
    public Student(int id, String firstName, String lastName, String birthDate, String studentId, String groupNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.studentId = studentId;
        this.groupNumber = groupNumber;
    }

    public int getId() {
        return id; // Getter for ID
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id + // Include ID in toString
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", studentId='" + studentId + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                '}';
    }

    // Getters for other fields
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

    private int generateId() {
        // Implement your logic to generate a unique ID
        // This is just a placeholder for your logic
        return (int) (Math.random() * 10000);
    }
}
