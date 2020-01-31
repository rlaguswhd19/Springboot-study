package hj.springboot.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner{
	
	@Autowired
	girl g;
	
	@Autowired
	private String hello;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(hello);
		System.out.println(g.getName());
		System.out.println(g.getAge());
		
		
	}
	
	
}
