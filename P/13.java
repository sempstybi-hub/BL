public class Main {

    public static void main(String[] args) {

        // создание потока через Runnable + лямбда
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Поток выполняется: " + i);
                try {
                    Thread.sleep(500); // пауза для наглядности
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // создание потока
        Thread thread = new Thread(task);

        // запуск потока
        thread.start();

        // основной поток
        System.out.println("Main поток завершил запуск");
    }
}

// Runnable — функциональный интерфейс для задачи потока
// лямбда используется вместо анонимного класса
// Thread управляет выполнением потока
// start() запускает новый поток