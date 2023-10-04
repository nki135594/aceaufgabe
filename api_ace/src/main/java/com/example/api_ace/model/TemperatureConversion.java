package com.example.api_ace.model;

public class TemperatureConversion {
    private double celsius;
    private double kelvin;

    public TemperatureConversion(double celsius, double kelvin) {
        this.celsius = celsius;
        this.kelvin = kelvin;
    }

    // Getter und Setter (optional)

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }
}

