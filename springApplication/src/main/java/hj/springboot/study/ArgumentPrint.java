package hj.springboot.study;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ArgumentPrint implements ApplicationRunner{
//	public ArgumentPrint(ApplicationArguments arg) {
//		System.out.println("foo : "+arg.containsOption("foo"));
//		System.out.println("bar : "+arg.containsOption("bar"));
//	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("foo : "+args.containsOption("foo"));
		System.out.println("bar : "+args.containsOption("bar"));
	}
}
