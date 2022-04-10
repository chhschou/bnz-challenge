package com.example.demo.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherForecastController {
    private static final Double WELLINGTON_LAT = -41.2685;
    private static final Double WELLINGTON_LONG = 174.7762;

    @Autowired
    private OpenMeteoClient openMeteoClient;

    @GetMapping("/weatherforecast/wellington")
    public WeatherForecastDataResponseDTO getWellingtonWeatherForecastData(
            @RequestParam MultiValueMap<String, Object> params) {

        params.set("latitude", WELLINGTON_LAT);
        params.set("longitude", WELLINGTON_LONG);

        var forecast = openMeteoClient.getForecast(params);

        return forecast;
    }
}
