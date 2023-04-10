package com.udemywill.component;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("exampleComponent")
public class ExampleComponent {
	private static final Log LOG= (Log) LogFactory.getLog(ExampleComponent.class);
	//private static final Log LOGGER= LogFactory.getLog(Example3Controller.class);
	
	public void sayHello() {
		LOG.info("Hello FROM EXAMPLEcomponent");
	}

}
