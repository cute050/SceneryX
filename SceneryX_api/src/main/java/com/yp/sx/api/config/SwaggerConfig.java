package com.yp.sx.api.config;


import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author yp
 * @since 2022/11/12
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public ApiInfo createApiInfo(){
        return new ApiInfoBuilder().title("SceneryX接口文档").description("接口文档")
                .contact(new Contact("土狗","http://tugou.com","tugou@outlook.com"))
                .version("v1.0.0").build();
    }

    @Bean
    public Docket createApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createApiInfo()).select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .build();
    }
}
