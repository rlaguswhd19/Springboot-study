package hj.springboot.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExternalSettingApplication {
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ExternalSettingApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
	}

}
