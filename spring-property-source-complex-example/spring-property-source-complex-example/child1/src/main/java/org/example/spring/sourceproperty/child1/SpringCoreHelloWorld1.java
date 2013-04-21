package org.example.spring.sourceproperty.child1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("helloWorldBean1")
public class SpringCoreHelloWorld1 {
	
	@Autowired(required=true)
	private Environment env;
	
	@Value("${test1}")
	private String  test1;
	@Value("${testchild3}")
	private String  testchild3;
	@Value("${testchild2}")
	private String  testchild2;
	@Value("${testchild1}")
	private String  testchild1;
	
	
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
        System.out.println("testchild1 from env:" + env.getProperty("testchild1"));
        System.out.println("testchild1 from annotation:" + testchild1);
         System.out.println("testchild2 from env:" + env.getProperty("testchild2"));
        System.out.println("testchild2 from annotation:" + testchild2);
        System.out.println("testchild3 from env:" + env.getProperty("testchild3"));
        System.out.println("testchild3 from annotation:" + testchild3);

        
    }
}
