package hj.springboot.study;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner{
	
	@Autowired
	KhjProperties khj;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println(khj.getName());
		System.out.println(khj.getAge());
	}

}
