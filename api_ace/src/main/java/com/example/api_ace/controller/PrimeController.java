package com.example.api_ace.controller;

import com.example.api_ace.model.PrimeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PrimeController {

    @GetMapping("/prime")
    public PrimeResponse getPrimes(@RequestParam int limit) {
        if (limit <= 1 || limit > 10000) {
            throw new IllegalArgumentException("Limit must be between 2 and 10000");
        }

        List<Integer> primes = new ArrayList<>();
        boolean[] isPrime = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return new PrimeResponse(primes);
    }
}

