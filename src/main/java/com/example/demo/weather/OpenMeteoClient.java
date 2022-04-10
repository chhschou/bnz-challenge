package com.example.demo.weather;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "openmeteo", url = "https://api.open-meteo.com/v1/forecast", configuration = FeignConfig.class)
public interface OpenMeteoClient {

    @RequestMapping(method = RequestMethod.GET, value = "/", produces = "application/json")
    WeatherForecastDataResponseDTO getForecast(@SpringQueryMap MultiValueMap<String, Object> params);
}