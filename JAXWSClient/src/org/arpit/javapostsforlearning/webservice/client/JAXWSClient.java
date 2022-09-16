package org.arpit.javapostsforlearning.webservice.client;

import org.arpit.javapostsforlearning.webservice.HelloWorld;
import org.arpit.javapostsforlearning.webservice.HelloWorldImplService;

//import org.arpit.javapostsforlearning.webservice.HelloWorld;
//import org.arpit.javapostsforlearning.webservice.HelloWorldImplService;

/**
* @author Willmer Orsetti
*/
public class JAXWSClient {

	public static void main(String [] Args){
        HelloWorldImplService helloWorldService = new HelloWorldImplService();
		 HelloWorld helloWorld = helloWorldService.getHelloWorldImplPort();
		System.out.println(helloWorld.helloWorld("Willmer Orsetti"));
	}

}
