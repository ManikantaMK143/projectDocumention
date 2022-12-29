package com.ty.project.doc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@OpenAPIDefinition(info = @Info(title = "Project Documentation", version = "1.0", description = "Project Documentation project from TESTYANTRA "))
@Configuration
public class ProjectDocumentationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectDocumentationApplication.class, args);
	}
	
	@Bean
    public Docket productApi() {
        Contact contact =new Contact(
                "Vineet Mishra",
                "https://github.com/xbox2204",
                "whatwillyoudo@withmyemail.com"
        );
        ApiInfo apiInfo= new ApiInfoBuilder().title("VINEET SPRING-BOOT API")
                .description("Spring-Boot for all")
                .termsOfServiceUrl("jUST CHILL!!!")
                .contact(contact)
                .licenseUrl("something@something.com").version("1.0").build();

        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.any())
                .build();
    }

}
