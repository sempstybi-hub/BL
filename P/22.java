import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.Payload;

import java.lang.annotation.*;
import java.util.regex.Pattern;

// ===================== АННОТАЦИЯ =====================
@Constraint(validatedBy = EmailValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface ValidEmail {

    String message() default "Email некорректный";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

// ===================== ВАЛИДАТОР =====================
class EmailValidator implements ConstraintValidator<ValidEmail, String> {

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) return false;
        return EMAIL_PATTERN.matcher(value).matches();
    }
}

// ===================== ENTITY =====================
class User {

    private String name;

    @ValidEmail
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}

// ===================== SERVICE =====================
class UserService {

    public void createUser(String name, String email) {

        if (name == null || name.isBlank()) {
            throw new RuntimeException("Имя пустое");
        }

        if (email == null || !email.contains("@")) {
            throw new RuntimeException("Email некорректный");
        }

        System.out.println("Пользователь создан");
    }
}

// ===================== MAIN (для запуска демо) =====================
public class Main {

    public static void main(String[] args) {

        UserService service = new UserService();

        service.createUser("Ivan", "ivan@mail.com");
    }
}