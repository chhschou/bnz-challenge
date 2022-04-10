package com.example.demo.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * {
 * "latitude": 52.52,
 * "longitude": 13.419,
 * "elevation": 44.812,
 * "generationtime_ms": 2.2119,
 * "utc_offset_seconds": 0,
 * "hourly": {
 * "time": ["2021-08-28T00:00", "2021-08-28T01:00", "2021-08-28T02:00", ...],
 * "temperature_2m": [13, 12.7, 12.7, 12.5, 12.5, 12.8, 13, 12.9, 13.3, ...]
 * },
 * "hourly_units": {
 * "temperature_2m": "°C"
 * },
 * "current_weather": {
 * "time": "2021-08-28T09:00",
 * "temperature": 13.3,
 * "weathercode": 3,
 * "windspeed": 10.3,
 * "winddirection": 262
 * }
 * }
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherForecastDataResponseDTO {
    public ForecastDataHourly hourly;
}
