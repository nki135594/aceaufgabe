package com.example.api_ace.controller;

import com.example.api_ace.model.TemperatureConversion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureController {

    @GetMapping("/temp")
    public TemperatureConversion convertTemperature(@RequestParam double celsius) {
        double kelvin = celsiusToKelvin(celsius);
        return new TemperatureConversion(celsius, kelvin);
    }

    private double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}


