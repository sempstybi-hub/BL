import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String[] data = {"10", "20", "abc", "30", "4x", "50", "-7"};

        List<Integer> result = Arrays.stream(data)
                // оставляем только строки, которые можно преобразовать в число
                .filter(Main::isNumeric)
                // преобразуем в Integer
                .map(Integer::parseInt)
                // собираем в список
                .collect(Collectors.toList());

        System.out.println(result);
    }

    // проверка: является ли строка числом
    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}