import java.util.List;

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

    private Group(Builder builder) {
        this.groupNumber = builder.groupNumber;
        this.creationYear = builder.creationYear;
        this.department = builder.department;
        this.curatorFirstName = builder.curatorFirstName;
        this.curatorLastName = builder.curatorLastName;
        this.students = builder.students;
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

    // Getters for accessing fields
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

    // Builder class
    public static class Builder {
        private String groupNumber;
        private int creationYear;
        private String department;
        private String curatorFirstName;
        private String curatorLastName;
        private List<Student> students;

        public Builder setGroupNumber(String groupNumber) {
            this.groupNumber = groupNumber;
            return this;
        }

        public Builder setCreationYear(int creationYear) {
            if (creationYear < 1900 || creationYear > 2100) {
                throw new IllegalArgumentException("Invalid creation year: " + creationYear);
            }
            this.creationYear = creationYear;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Builder setCuratorFirstName(String curatorFirstName) {
            this.curatorFirstName = curatorFirstName;
            return this;
        }

        public Builder setCuratorLastName(String curatorLastName) {
            this.curatorLastName = curatorLastName;
            return this;
        }

        public Builder setStudents(List<Student> students) {
            this.students = students;
            return this;
        }

        public Group build() {
            return new Group(this);
        }
    }
}
