import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testFindAllReturnsMockedList() {

        // 1. создаём mock репозитория
        UserRepository userRepository = Mockito.mock(UserRepository.class);

        // 2. подготавливаем тестовые данные
        List<User> mockUsers = Arrays.asList(
                new User("Ivan", "ivan@mail.com"),
                new User("Anna", "anna@mail.com")
        );

        // 3. настраиваем поведение mock
        when(userRepository.findAll()).thenReturn(mockUsers);

        // 4. вызываем метод
        List<User> result = userRepository.findAll();

        // 5. проверка
        assertEquals(2, result.size());
        assertEquals("Ivan", result.get(0).getName());

        // 6. проверяем, что метод реально вызывался
        verify(userRepository, times(1)).findAll();
    }
}