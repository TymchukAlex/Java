package org.example;

public class Student {
    private String firstName;
    private String lastName;
    private String birthDate;
    private String studentId;
    private String groupNumber;

    // Default constructor
    public Student() {
    }

    public Student(String firstName, String lastName, String birthDate, String studentId, String groupNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.studentId = studentId;
        this.groupNumber = groupNumber;
    }

    // Getters
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
}
