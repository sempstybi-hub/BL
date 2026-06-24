import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList(
                "Apple",
                "banana",
                "Cherry",
                "date",
                "Fig",
                "grape"
        );

        List<String> result = strings.stream()
                // фильтруем строки, начинающиеся с заглавной буквы
                .filter(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)))
                
                // переводим в верхний регистр
                .map(String::toUpperCase)
                
                // собираем обратно в список
                .collect(Collectors.toList());

        System.out.println(result);
    }
}

// stream() → создаём поток данных
// filter() → фильтрация по условию (первая буква заглавная)
// map() → преобразование элементов
// collect() → сбор результата обратно в список
// используется функциональный стиль программирования