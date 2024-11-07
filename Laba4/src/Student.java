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

    private Student(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.birthDate = builder.birthDate;
        this.studentId = builder.studentId;
        this.groupNumber = builder.groupNumber;
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

    // Getters for accessing fields
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

    // Builder class for Student
    public static class Builder {
        private String firstName;
        private String lastName;
        private String birthDate;
        private String studentId;
        private String groupNumber;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder setGroupNumber(String groupNumber) {
            this.groupNumber = groupNumber;
            return this;
        }

        public Student build() {
            // Validate fields here if necessary
            return new Student(this);
        }
    }
}
