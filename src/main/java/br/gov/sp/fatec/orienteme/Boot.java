package br.gov.sp.fatec.orienteme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@Configuration
@EntityScan(basePackages="br.gov.sp.fatec.orienteme")
@EnableJpaRepositories(basePackages="br.gov.sp.fatec.orienteme.repository")
@EnableSwagger2
public class Boot
{

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Configuration.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Configuration.class, args);
	}
}
