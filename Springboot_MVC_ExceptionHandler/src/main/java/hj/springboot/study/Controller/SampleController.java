package hj.springboot.study.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import hj.springboot.study.ExceptionHandler.SampleException;

@RestController
public class SampleController {

	@GetMapping("/hello")
	public String hello() {
		throw new SampleException();
	}
}
