import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {

        // Первая асинхронная задача
        CompletableFuture<Integer> task1 = CompletableFuture.supplyAsync(() -> {
            sleep(1000);
            return 10;
        });

        // Вторая асинхронная задача
        CompletableFuture<Integer> task2 = CompletableFuture.supplyAsync(() -> {
            sleep(1500);
            return 20;
        });

        // Объединение результатов
        CompletableFuture<Integer> result = task1.thenCombine(task2, (a, b) -> a + b);

        // получение результата (блокировка main потока)
        System.out.println("Результат: " + result.join());
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}