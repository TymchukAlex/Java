import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    private final String url = "jdbc:mysql://localhost:3306/university"; // Ваша URL до бази даних
    private final String user = "yourUsername"; // Ваше ім'я користувача
    private final String password = "yourPassword"; // Ваш пароль

    // Метод для підключення до бази даних
    private Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    // CRUD для Student
    public void addStudent(Student student) {
        String sql = "INSERT INTO students (first_name, last_name, birth_date, student_id, group_number) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, student.getFirstName());
            pstmt.setString(2, student.getLastName());
            pstmt.setDate(3, Date.valueOf(student.getBirthDate()));
            pstmt.setString(4, student.getStudentId());
            pstmt.setString(5, student.getGroupNumber());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Student student = new Student(
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getDate("birth_date").toString(),
                        rs.getString("student_id"),
                        rs.getString("group_number")
                );
                students.add(student);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return students;
    }

    public void updateStudent(int id, Student student) {
        String sql = "UPDATE students SET first_name = ?, last_name = ?, birth_date = ?, student_id = ?, group_number = ? WHERE id = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, student.getFirstName());
            pstmt.setString(2, student.getLastName());
            pstmt.setDate(3, Date.valueOf(student.getBirthDate()));
            pstmt.setString(4, student.getStudentId());
            pstmt.setString(5, student.getGroupNumber());
            pstmt.setInt(6, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // CRUD для Group
    public void addGroup(Group group) {
        String sql = "INSERT INTO groups (group_number, creation_year, department, curator_first_name, curator_last_name) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, group.getGroupNumber());
            pstmt.setInt(2, group.getCreationYear());
            pstmt.setString(3, group.getDepartment());
            pstmt.setString(4, group.getCuratorFirstName());
            pstmt.setString(5, group.getCuratorLastName());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Group> getAllGroups() {
        List<Group> groups = new ArrayList<>();
        String sql = "SELECT * FROM groups";
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Group group = new Group(
                        rs.getString("group_number"),
                        rs.getInt("creation_year"),
                        rs.getString("department"),
                        rs.getString("curator_first_name"),
                        rs.getString("curator_last_name"),
                        new ArrayList<>() // Поки що не заповнюємо студентів
                );
                groups.add(group);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return groups;
    }

    public void updateGroup(int id, Group group) {
        String sql = "UPDATE groups SET group_number = ?, creation_year = ?, department = ?, curator_first_name = ?, curator_last_name = ? WHERE id = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, group.getGroupNumber());
            pstmt.setInt(2, group.getCreationYear());
            pstmt.setString(3, group.getDepartment());
            pstmt.setString(4, group.getCuratorFirstName());
            pstmt.setString(5, group.getCuratorLastName());
            pstmt.setInt(6, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteGroup(int id) {
        String sql = "DELETE FROM groups WHERE id = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
