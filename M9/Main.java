public class Main {

    // Метод для сложения двух чисел
    static int sum(int a, int b) {
        return a + b;
    }

    // Метод для вывода приветствия
    static void sayHello() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {

        sayHello();

        int result = sum(5, 3);

        System.out.println("Sum = " + result);
    }
}