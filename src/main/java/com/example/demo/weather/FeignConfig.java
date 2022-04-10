package com.example.demo.weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.support.ResponseEntityDecoder;
import org.springframework.context.annotation.Bean;

import feign.codec.Decoder;
import feign.jackson.JacksonDecoder;

public class FeignConfig {
    @Autowired
    ObjectMapper objectMapper;

    @Bean
    public Decoder feignDecoder() {
        return new ResponseEntityDecoder(new JacksonDecoder(objectMapper));
    }
}
