package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo2Application extends SpringBootServletInitializer {

	private static final Logger log = LoggerFactory.getLogger(Demo2Application.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Demo2Application.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class);
	}


	@Bean
	public CommandLineRunner demo10(final Employee1Repository repository) {
	    return new CommandLineRunner() {
			public void run(String... args) throws Exception {
				if (repository.count() == 0) {
					log.info("Database is still empty. Adding some sample records");
					System.out.println("Preloading " + repository.save(new Employee1("aaa")));
				    System.out.println("Preloading " + repository.save(new Employee1("bbb")));
				}
	        }
	    };
	}

}

