package com.exavalu.budgetbakersb.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public NumberUtils numberUtils() {
        return new NumberUtils();
    }
}
