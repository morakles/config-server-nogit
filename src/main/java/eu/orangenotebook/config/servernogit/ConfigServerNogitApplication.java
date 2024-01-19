package eu.orangenotebook.config.servernogit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerNogitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerNogitApplication.class, args);
	}

}
