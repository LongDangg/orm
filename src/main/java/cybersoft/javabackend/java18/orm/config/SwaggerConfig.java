package cybersoft.javabackend.java18.orm.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Go to http://localhost:8080/swagger-ui/index.html to see the result...
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI getOpenApi() {
        return new OpenAPI()
                .components(new Components().addSecuritySchemes("bearerAuth",
                        new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer")))
                .info(new Info()
                        .title("ORM Demo")
                        .description("Service for Education Purpose")
                        .version("v1.0")
                        .license(new License().name("NO LICENSE").url("http://tuanphan.dev"))
                        .contact(new Contact()
                                .email("contact@tuanphan.dev")
                                .name("Phan Thanh Tuan")
                                .url("https://tuanphan.dev")))
                .externalDocs(new ExternalDocumentation()
                        .description("Spring Documentation")
                        .url("https://docs.spring.io/spring-framework/docs/current/reference/html/"));

    }
}