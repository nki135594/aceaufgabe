package com.example.api_ace.model;

import java.util.List;

public class PrimeResponse {
    private List<Integer> primes;

    public PrimeResponse(List<Integer> primes) {
        this.primes = primes;
    }

    // Getter und Setter (optional)

    public List<Integer> getPrimes() {
        return primes;
    }

    public void setPrimes(List<Integer> primes) {
        this.primes = primes;
    }
}

