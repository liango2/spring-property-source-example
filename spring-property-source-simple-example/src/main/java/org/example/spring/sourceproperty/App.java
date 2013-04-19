package org.example.spring.sourceproperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Get Spring application context
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springApplicationContext.xml");
         
        // Get a bean instance
        SpringCoreHelloWorld helloWorldBeanInst = applicationContext.getBean("helloWorldBean", SpringCoreHelloWorld.class);
         
        // Execute SpringCoreHelloWorld bean's method
        helloWorldBeanInst.sayHello();
    }
}
