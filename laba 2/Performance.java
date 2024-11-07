import java.util.Objects;

/**
 * Represents a student's performance in a subject.
 */
public class Performance extends Student {
    private final String subject;
    private final String teacher;
    private final String date;
    private final int grade;

    private Performance(Builder builder) {
        super(builder.groupNumber, builder.creationYear, builder.department, builder.curatorFirstName, builder.curatorLastName,
              builder.firstName, builder.lastName, builder.birthDate, builder.studentId);
        this.subject = builder.subject;
        this.teacher = builder.teacher;
        this.date = builder.date;
        this.grade = builder.grade;
    }

    @Override
    public String toString() {
        return "Performance{" +
                "subject='" + subject + '\'' +
                ", teacher='" + teacher + '\'' +
                ", date='" + date + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Performance)) return false;
        Performance that = (Performance) o;
        return grade == that.grade &&
                Objects.equals(subject, that.subject) &&
                Objects.equals(teacher, that.teacher) &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, teacher, date, grade);
    }

    // Getters for accessing fields
    public String getSubject() {
        return subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getDate() {
        return date;
    }

    public int getGrade() {
        return grade;
    }

    // Static Builder class
    public static class Builder {
        private String groupNumber;
        private int creationYear;
        private String department;
        private String curatorFirstName;
        private String curatorLastName;
        private String firstName;
        private String lastName;
        private String birthDate;
        private String studentId;
        private String subject;
        private String teacher;
        private String date;
        private int grade;

        public Builder groupNumber(String groupNumber) {
            this.groupNumber = groupNumber;
            return this;
        }

        public Builder creationYear(int creationYear) {
            this.creationYear = creationYear;
            return this;
        }

        public Builder department(String department) {
            this.department = department;
            return this;
        }

        public Builder curatorFirstName(String curatorFirstName) {
            this.curatorFirstName = curatorFirstName;
            return this;
        }

        public Builder curatorLastName(String curatorLastName) {
            this.curatorLastName = curatorLastName;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder birthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder studentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder teacher(String teacher) {
            this.teacher = teacher;
            return this;
        }

        public Builder date(String date) {
            this.date = date;
            return this;
        }

        public Builder grade(int grade) {
            this.grade = grade;
            return this;
        }

        public Performance build() {
            return new Performance(this);
        }
    }
}
