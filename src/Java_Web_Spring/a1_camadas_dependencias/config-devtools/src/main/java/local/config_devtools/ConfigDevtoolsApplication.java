package local.config_devtools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// my.component.url=https://localhost:8080
@SpringBootApplication
public class ConfigDevtoolsApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigDevtoolsApplication.class, args);
	}

}
