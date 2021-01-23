package org.Beehive.documentation;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
@ComponentScan("package org.Beehive.documentation")
@Import({BeanValidatorPluginsConfiguration.class})
public class SwaggerConfig
{

    @Bean
    public Docket api()
    {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(Predicates.not(PathSelectors.regex("/error")))
                .build()
                .apiInfo(apiInfo());
    }


    private ApiInfo apiInfo()
    {
        String description = "Documentation of Beehive Monitoring System for the class DataProcessing";
        return new ApiInfoBuilder()
                .title("API documentation - Beehive")
                .description(description)
                .license("Unlicensed")
                .licenseUrl("")
                .version("1.0.0")
                .build();
    }
}