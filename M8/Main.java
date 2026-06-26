class Student {
    String name;
    int age;

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        // Создание объекта класса Student
        Student student = new Student();

        student.name = "Alex";
        student.age = 20;

        student.showInfo();
    }
}