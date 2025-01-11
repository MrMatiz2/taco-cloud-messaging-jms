package com.example.tacocloudmessagingjms.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "com.example.tacoclouddomain.kitchen"
})
public class BeansConfigJMS {
}
