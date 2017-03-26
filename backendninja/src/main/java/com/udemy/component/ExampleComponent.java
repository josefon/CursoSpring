package com.udemy.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("exampleComponent")
public class ExampleComponent {

	private final static Log LOGGER = LogFactory.getLog(ExampleComponent.class);
	
	public void sayHello(){
		LOGGER.info("Calling to ExampleComponent.sayHello");
	}
}
