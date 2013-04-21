package org.example.spring.sourceproperty.child2;

import org.example.spring.sourceproperty.child3.SpringCoreHelloWorld3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("helloWorldBean2")
@Import({SpringCoreHelloWorld3.class})
public class SpringCoreHelloWorld2 {
	
	@Autowired(required=true)
	private Environment env;
	
	@Value("${test1}")
	private String  test1;
	@Value("${testchild3}")
	private String  testchild3;
	@Value("${testchild2}")
	private String  testchild2;
	
	
    private String message = null;
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }  
     
    public void sayHello() {
    	System.out.println(this.getClass().getSimpleName());
        System.out.println("test1 from env:" + env.getProperty("test1"));
        System.out.println("test1 from annotation:" + test1);
        System.out.println("testchild2 from env:" + env.getProperty("testchild2"));
        System.out.println("testchild2 from annotation:" + testchild2);
        System.out.println("testchild3 from env:" + env.getProperty("testchild3"));
        System.out.println("testchild3 from annotation:" + testchild3);
        
    }
}
