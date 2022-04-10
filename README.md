### The Wellingon NZ weather forecast service

1. Install dependencies:

```
./mvnw install
```

1. Start spring boot service:

```
./mvnw spring-boot:run
```

1. Get Wellington NZ weather forecast. In browser address bar enter `http://localhost:8080/weatherforecast/wellington?hourly=temperature_2m`. Other parameters please see `https://open-meteo.com/en/docs`
