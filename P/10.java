import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    // поиск всех пользователей по имени
    List<User> findByName(String name);
}