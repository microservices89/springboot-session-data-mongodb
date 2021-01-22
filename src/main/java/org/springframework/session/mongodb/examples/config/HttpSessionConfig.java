
package org.springframework.session.mongodb.examples.config;

import java.time.Duration;

import org.springframework.context.annotation.Bean;
import org.springframework.session.data.mongo.JdkMongoSessionConverter;
import org.springframework.session.data.mongo.config.annotation.web.http.EnableMongoHttpSession;

// tag::class[]
@EnableMongoHttpSession // <1>
public class HttpSessionConfig {
//	uses standard Java serialization to persist session attributes map to MongoDB in a binary form. 
	//session timeout is configured for 30 minutes 
	@Bean
	public JdkMongoSessionConverter jdkMongoSessionConverter() {
		return new JdkMongoSessionConverter(Duration.ofSeconds(10)); // <2>
	}
}
