package com.booking.fileservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@Configuration
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CloudinaryConfig {
    @Value("${app.cloudinary.cloud-name}")
    String cloudName;
    
    @Value("${app.cloudinary.api-key}")
    String apiKey;

    @Value("${app.cloudinary.api-secret}")
    String apiSecret;

    @Bean
    public Cloudinary cloudinary(){
        return new Cloudinary(ObjectUtils.asMap(
            "cloud_name",cloudName,
            "api_key", apiKey,
            "api_secret", apiSecret 
        ));
    }
    
}
