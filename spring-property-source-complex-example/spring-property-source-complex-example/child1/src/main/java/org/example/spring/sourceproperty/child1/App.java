package org.example.spring.sourceproperty.child1;

import org.example.spring.sourceproperty.child2.SpringCoreHelloWorld2;
import org.example.spring.sourceproperty.child3.SpringCoreHelloWorld3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		// Get Spring application context
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"springApplicationContext.xml");

		// Get a bean instance
		SpringCoreHelloWorld1 helloWorldBeanInst1 = applicationContext.getBean(
				"helloWorldBean1", SpringCoreHelloWorld1.class);

		// Execute SpringCoreHelloWorld bean's method
		helloWorldBeanInst1.sayHello();

		// Get a bean instance
		SpringCoreHelloWorld2 helloWorldBeanInst2 = applicationContext.getBean(
				"helloWorldBean2", SpringCoreHelloWorld2.class);

		// Execute SpringCoreHelloWorld bean's method
		helloWorldBeanInst2.sayHello();
		// Get a bean instance
		SpringCoreHelloWorld3 helloWorldBeanInst3 = applicationContext.getBean(
				"helloWorldBean3", SpringCoreHelloWorld3.class);

		// Execute SpringCoreHelloWorld bean's method
		helloWorldBeanInst3.sayHello();
	}
}
