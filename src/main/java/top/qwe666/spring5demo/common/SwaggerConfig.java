package top.qwe666.spring5demo.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author jqw1122@foxmail.com
 * @description
 * @date 2018-07-30 2:13 PM
 */
@Configuration
@EnableSwagger2
@EnableWebMvc
@ComponentScan(basePackages = {"top.qwe666.spring5demo.controller"})
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any()).build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("江笑GG", "qwe666.top", "jqw1122@foxmail.com");
        return new ApiInfoBuilder()
                .title("Demo")
                .description("一个小荔枝")
                .contact(contact)
                .version("0.1")
                .build();
    }
}
