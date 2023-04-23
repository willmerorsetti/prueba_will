package net.javaguides.resteasytutorial.model;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HelloWorld {
	private String message;



	public HelloWorld(String message2) {
		super();
		this.message = message2;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
