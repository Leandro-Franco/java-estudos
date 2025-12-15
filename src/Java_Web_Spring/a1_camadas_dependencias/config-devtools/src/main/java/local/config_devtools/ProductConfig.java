package local.config_devtools;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

    @Bean
    public DataBase primaryConfigDataBase() {
        return new DataBase("Primary Product on Stock");
    }
}
