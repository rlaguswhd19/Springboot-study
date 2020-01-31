package hj.springboot.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner{
	
	private Logger logger = LoggerFactory.getLogger(AppRunner.class);
	
	@Autowired
	girl g;
	
	@Autowired
	private String hello;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.debug("===================================");
		logger.debug("KHJ");
		logger.debug(g.getName());
		logger.debug(""+g.getAge());
		
		System.out.println(hello);
		System.out.println(g.getName());
		System.out.println(g.getAge());
		
		
	}
	
	
}
