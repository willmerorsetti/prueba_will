package org.arpit.javapostsforlearning.webservice;
import javax.jws.WebService;

@WebService(endpointInterface="org.arpit.javapostsforlearning.webservice.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
	public String helloWorld(String name){
		return "Hello World from: "+name;
	}

}
