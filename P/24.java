// src/
//  └── config/
//       └── AppConfig.java

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService() {

        // логика инициализации
        System.out.println("Инициализация UserService bean");

        UserService service = new UserService();

        // можно задать начальные параметры
        service.setPrefix("USER:");

        return service;
    }
}