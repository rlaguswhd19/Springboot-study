package hj.springboot.study;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class StartedListener implements ApplicationListener<ApplicationStartedEvent>{

	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.println("STARTED LISTENER");
		System.out.println("+++++++++++++++++++++++++++++++");
	}
	
}
