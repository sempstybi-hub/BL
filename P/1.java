public class Singleton {

    // volatile нужен для корректной работы в многопоточности
    private static volatile Singleton instance;

    // приватный конструктор — запрещаем создание извне
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) { // первая проверка (быстрая)
            synchronized (Singleton.class) {
                if (instance == null) { // вторая проверка (безопасная)
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

// private constructor → нельзя создать объект через new
// static instance → хранит единственный объект класса
// lazy initialization → объект создаётся только при первом вызове getInstance()
// synchronized → защищает от одновременного создания в потоках
// double-check → уменьшает накладные расходы (синхронизация только при первом создании)
// volatile → гарантирует корректную видимость объекта между потоками