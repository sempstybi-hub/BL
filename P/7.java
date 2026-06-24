import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Optional<String> value = Optional.ofNullable(null);

        // безопасное получение значения с дефолтом
        String result = value.orElse("Значение по умолчанию");

        System.out.println(result);
    }
}


// Эта фигня выведет значение по умолчанию, если не поменять .ofNullable(null)

// Optional — контейнер, который может содержать null или значение
// orElse() — возвращает значение или дефолт
// используется для избежания NullPointerException