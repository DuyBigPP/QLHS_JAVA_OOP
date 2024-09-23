import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập tên lớp: ");
        String className = scanner.nextLine();
        Classroom classroom = new Classroom(className);
        
        
        System.out.print("Nhập số lượng học sinh: ");
        int studentCount = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Nhập tên học sinh: ");
            String name = scanner.nextLine();
            System.out.print("Nhập tuổi học sinh: ");
            int age = scanner.nextInt();
            scanner.nextLine();  

            Student student = new Student(name, age);
            classroom.addStudent(student);
        }

       
        classroom.displayClassInfo();
    }
}
