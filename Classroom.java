import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String className;
    private List<Student> students;

    // Constructor
    public Classroom(String className) {
        this.className = className;
        this.students = new ArrayList<>();
    }

    // Phương thức thêm học sinh vào lớp
    public void addStudent(Student student) {
        students.add(student);
    }

    // Phương thức hiển thị thông tin tất cả học sinh trong lớp
    public void displayClassInfo() {
        System.out.println("Lớp: " + className);
        for (Student student : students) {
            student.displayInfo();
        }
    }
}
