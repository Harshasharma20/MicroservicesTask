package com.task.service.baseservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;


@Configuration
public class SwaggerConfiguration {
	/*
    @Bean
    public Docket api() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.task.service.baseservice.controller")) // Replace with your controller package
                .build()
                .apiInfo(statusApiInfo())
                .apiInfo(prepareResponseInfo());
        return docket;
    }

    private ApiInfo statusApiInfo() {
        return new ApiInfoBuilder()
                .title("GET API - Application Status")
                .description("This is used to get the status of application whether it is running or not")
                .version("1.0")
                .build();
    }

    private ApiInfo prepareResponseInfo() {
        return new ApiInfoBuilder()
                .title("POST API - Name parsing")
                .description("This is user to parse and concat name with providing details")
                .version("1.0")
                .build();
    }
    */
    @Bean
	public OpenAPI openAPI() {
		return new OpenAPI()
				.info(new Info().title("service")
			    .description("Description")
			    .version("2.5")
			    .license(new License().name("Apache 2.0").url("http://springdoc.org"))
			    		
	).externalDocs(new ExternalDocumentation().description("desc").url("https://springshop.wiki.github.org/docs"));
	                     
	                      
	}
}