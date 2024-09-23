public class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Phương thức hiển thị thông tin học sinh
    public void displayInfo() {
        System.out.println("Tên: " + name + ", Tuổi: " + age);
    }
}
