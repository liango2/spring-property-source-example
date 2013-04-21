package org.example.spring.sourceproperty.child1;

import org.example.spring.sourceproperty.child2.SpringCoreHelloWorld2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@Import({SpringCoreHelloWorld2.class})
@PropertySource("classpath:propertysource.properties"  )
public class ApplicationConfiguration {
	
	@Autowired
	private static Environment env;
	
//	@Bean
//	public static PropertySourcesPlaceholderConfigurer properties(){
//	  PropertySourcesPlaceholderConfigurer pspc =
//	   new PropertySourcesPlaceholderConfigurer();
//	  Resource[] resources = new ClassPathResource[ ]
//	   { new ClassPathResource( "propertysource.properties" ) };
//	  pspc.setLocations( resources );
//	  pspc.setIgnoreUnresolvablePlaceholders( true );
//	  return pspc;	
//	}
	
}
