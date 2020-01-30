package hj.springboot.study;

import java.io.PrintStream;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@SpringBootApplication
@RestController
public class JarApplication {

	@GetMapping("/")
	public String Hello() {
		return "HELLO";
	}
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(JarApplication.class);
		app.setBanner(new Banner() {

			@Override
			public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
				// TODO Auto-generated method stub
				out.println("======================================");
				out.println("KIM HYEON JONG SPINRG BOOT");
				out.println("======================================");
			}
			
		});
//		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
		
	}

}
