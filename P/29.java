🌳 Структура (упрощённо)
src/
 └── service/
       └── OrderService.java
✔️ Готовый код (SLF4J + INFO + ERROR)
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderService {

    // создаём логгер
    private static final Logger logger =
            LoggerFactory.getLogger(OrderService.class);

    public void processOrder(int orderId) {

        logger.info("Начало обработки заказа: {}", orderId);

        try {
            if (orderId <= 0) {
                throw new IllegalArgumentException("Некорректный ID заказа");
            }

            // бизнес-логика
            System.out.println("Обработка заказа " + orderId);

            logger.info("Заказ успешно обработан: {}", orderId);

        } catch (Exception e) {

            logger.error("Ошибка при обработке заказа: {}", orderId, e);
        }
    }
}