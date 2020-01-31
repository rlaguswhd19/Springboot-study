package hj.springboot.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfileStudyApplication {
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ProfileStudyApplication.class);
		app.run(args);
	}

}
