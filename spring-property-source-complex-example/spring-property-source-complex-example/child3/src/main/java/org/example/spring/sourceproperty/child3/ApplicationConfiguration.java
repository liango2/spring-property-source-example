package org.example.spring.sourceproperty.child3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration 
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
