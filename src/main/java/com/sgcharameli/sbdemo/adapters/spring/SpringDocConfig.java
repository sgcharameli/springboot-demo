package com.sgcharameli.sbdemo.adapters.spring;

import java.util.Optional;

import org.springdoc.core.configuration.SpringDocConfiguration;
import org.springdoc.core.configuration.SpringDocUIConfiguration;
import org.springdoc.core.properties.SpringDocConfigProperties;
import org.springdoc.core.properties.SwaggerUiConfigProperties;
import org.springdoc.core.providers.ObjectMapperProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// https://springdoc.org/#what-is-a-proper-way-to-set-up-swagger-ui-to-use-provided-spec-yml

@Configuration
public class SpringDocConfig {


  @Bean
  SpringDocConfiguration springDocConfiguration(){
    return new SpringDocConfiguration();
  }

  @Bean
  SpringDocConfigProperties springDocConfigProperties() {
    return new SpringDocConfigProperties();
  }

  @Bean
  ObjectMapperProvider objectMapperProvider(SpringDocConfigProperties springDocConfigProperties){
    return new ObjectMapperProvider(springDocConfigProperties);
  }

  @Bean
  SpringDocUIConfiguration SpringDocUIConfiguration(
      Optional<SwaggerUiConfigProperties> optionalSwaggerUiConfigProperties){
    return new SpringDocUIConfiguration(optionalSwaggerUiConfigProperties);
  }
}
