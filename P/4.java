import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> result = groupByEvenOdd(numbers);

        System.out.println(result);
    }

    // метод группировки
    public static Map<Boolean, List<Integer>> groupByEvenOdd(List<Integer> numbers) {

        return numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));
    }
}

// используется Stream API
// groupingBy группирует элементы по условию
// ключ — результат логического выражения
// значение — список элементов, подходящих под ключ