package org.example.spring.sourceproperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("helloWorldBean")
public class SpringCoreHelloWorld {
	
	@Autowired(required=true)
	private Environment env;
	
	@Value("${test1}")
	private String  test1;
	@Value("${test2}")
	private String  test2;
	
	
    private String message = null;
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }  
     
    public void sayHello() {
        System.out.println(getMessage());
        System.out.println("test1 from env:" + env.getProperty("test1"));
        System.out.println("test1 from annotation:" + test1);
        System.out.println("test2 from env:" + env.getProperty("test2"));
        System.out.println("test2 from annotation:" + test2);
        
    }
}
