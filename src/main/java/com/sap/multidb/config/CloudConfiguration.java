package com.sap.multidb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class CloudConfiguration {

    @Bean
    ObjectMapper getObjectMapper() {
        return new ObjectMapper();
    }

}
