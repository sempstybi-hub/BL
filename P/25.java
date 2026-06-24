import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {

    private List<String> users;

    // выполняется ПЕРЕД КАЖДЫМ тестом
    @BeforeEach
    void setUp() {
        users = new ArrayList<>();
        users.add("Ivan");
        users.add("Anna");
    }

    @Test
    void testUsersSize() {
        assertEquals(2, users.size());
    }

    @Test
    void testContainsIvan() {
        assertEquals(true, users.contains("Ivan"));
    }
}