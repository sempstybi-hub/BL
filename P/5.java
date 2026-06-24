class InvalidDataException extends RuntimeException {

    public InvalidDataException(String message) {
        super(message);
    }
}

public class Main {

    public static void main(String[] args) {

        int age = -5;

        if (age < 0) {
            throw new InvalidDataException("Age cannot be negative");
        }

        System.out.println("Возраст: " + age);
    }
}

// Программа крашится с нашим комментарием, все ок

// это пользовательское исключение
// расширяет RuntimeException
// используется для логических ошибок в данных
// позволяет явно сигнализировать о некорректных входных значениях