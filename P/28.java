🌳 Структура проекта
src/
 ├── service/
 │     ├── MessageService.java
 │     └── MessageServiceImpl.java
 └── test/
       └── MessageServiceTest.java
📄 1. Интерфейс
package service;

import java.util.List;

public interface MessageService {
    List<String> getMessages();
}
📄 2. Реализация
package service;

import java.util.Arrays;
import java.util.List;

public class MessageServiceImpl implements MessageService {

    @Override
    public List<String> getMessages() {
        return Arrays.asList("Hello", "World");
    }
}
📄 3. Тест (JUnit 5)
import org.junit.jupiter.api.Test;
import service.MessageService;
import service.MessageServiceImpl;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class MessageServiceTest {

    @Test
    void testMessagesNotEmpty() {

        MessageService service = new MessageServiceImpl();

        List<String> messages = service.getMessages();

        assertFalse(messages.isEmpty());
    }
}