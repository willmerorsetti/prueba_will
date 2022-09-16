package org.arpit.javapostsforlearning.webservice;
import javax.xml.ws.Endpoint;
public class HelloWorldWSPublisher {
	public static void main (String []Args ){
		Endpoint.publish("http://localhost:8080/WS/HelloWorld", new HelloWorldImpl());		
	}
	//Para probar :
	//http://localhost:8080/WS/HelloWorld?wsdl
	//cd %project_home%/src
	//wsimport -s . http://localhost:8080/WS/HelloWorld?wsdl
}
