import org.springframework.stereotype.Service;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

// ===== ENTITY =====
class User {
    String name;
    String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

// ===== REPOSITORY =====
@Repository
class UserRepository {
    public List<User> findAll() {
        return new ArrayList<>();
    }
}

// ===== SERVICE =====
@Service
class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }
}