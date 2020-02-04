package hj.springboot.study;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {
		"http://localhost:18080"
})
public class SampleController {

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}
