import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody User user) {

        // здесь обычно была бы логика сохранения в БД
        System.out.println("Получен пользователь: " + user.getName());

        return ResponseEntity.ok("User created successfully");
    }
}

