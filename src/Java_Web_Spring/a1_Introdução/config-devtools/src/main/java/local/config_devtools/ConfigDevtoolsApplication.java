package local.config_devtools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigDevtoolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigDevtoolsApplication.class, args);
		OlaMundoController ola = new OlaMundoController();
	}

}
