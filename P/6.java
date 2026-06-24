import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String path = "input.txt";

        // try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}

// Создать файл input.txt

// try-with-resources автоматически закрывает ресурсы
// используется с AutoCloseable
// BufferedReader реализует AutoCloseable
// исключения обрабатываются через IOException