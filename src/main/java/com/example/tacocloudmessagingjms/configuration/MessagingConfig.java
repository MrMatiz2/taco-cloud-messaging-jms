package com.example.tacocloudmessagingjms.configuration;

import com.example.tacoclouddomain.entities.TacoOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class MessagingConfig {

    @Bean
    public MappingJackson2MessageConverter mappingJackson2HttpMessageConverter() {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTypeIdPropertyName("_typeId");
        Map<String, Class<?>> typeMap = new HashMap<>();
        typeMap.put("order", TacoOrder.class);
        converter.setTypeIdMappings(typeMap);
        return converter;
    }

}
