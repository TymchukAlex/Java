package org.example;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Тарас", "Шевченко", "2007-01-15", "S001", "Група 101"));
        students.add(new Student("Анна", "Коваль", "2006-02-20", "S002", "Група 102"));
        students.add(new Student("Олег", "Сидоренко", "2005-03-25", "S003", "Група 103"));
        students.add(new Student("Марія", "Іванова", "2008-04-30", "S004", "Група 104"));
        students.add(new Student("Іван", "Петренко", "2009-05-05", "S005", "Група 105"));

        // Output directory
        File outputDir = new File("output");
        if (!outputDir.exists()) {
            outputDir.mkdir();  // Create the directory if it doesn't exist
        }

        // JSON Serialization
        JsonSerializer<Student> jsonSerializer = new JsonSerializer<>(Student.class);
        try {
            jsonSerializer.writeListToFile(students, new File(outputDir, "students.json"));
            List<Student> deserializedJsonStudents = jsonSerializer.readListFromFile(new File(outputDir, "students.json"));
            System.out.println("Deserialized JSON Students: " + deserializedJsonStudents);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // XML Serialization
        XmlSerializer<Student> xmlSerializer = new XmlSerializer<>(Student.class);
        try {
            xmlSerializer.writeListToFile(students, new File(outputDir, "students.xml"));
            List<Student> deserializedXmlStudents = xmlSerializer.readListFromFile(new File(outputDir, "students.xml"));
            System.out.println("Deserialized XML Students: " + deserializedXmlStudents);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // YAML Serialization
        YamlSerializer<Student> yamlSerializer = new YamlSerializer<>(Student.class);
        try {
            yamlSerializer.writeListToFile(students, new File(outputDir, "students.yaml"));
            List<Student> deserializedYamlStudents = yamlSerializer.readListFromFile(new File(outputDir, "students.yaml"));
            System.out.println("Deserialized YAML Students: " + deserializedYamlStudents);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
