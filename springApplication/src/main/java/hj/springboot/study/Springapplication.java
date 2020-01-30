package hj.springboot.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springapplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Springapplication.class);
		app.addListeners(new StartListener());
		app.setWebApplicationType(WebApplicationType.SERVLET);
		app.run(args);
	}

}
