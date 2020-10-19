package com.reniec.atm;

import com.google.common.base.Predicates;
import java.util.Collections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  /**   
   * apidocket.
   **/
  @Bean
  public Docket apiDocket() {
    return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
        // .paths(PathSelectors.any())
        .paths(Predicates.not(PathSelectors.regex("/error.*"))).build().apiInfo(getApiInfo());
  }

  private ApiInfo getApiInfo() {
    return new ApiInfo("Finger Print Reniec Service API", "Finger Print API Description", "1.0",
        "http://empresa.com/terms", new Contact("everis", "https://empresa.com", "apis@empresa.com"), "LICENSE",
        "LICENSE URL", Collections.emptyList());
  }
}