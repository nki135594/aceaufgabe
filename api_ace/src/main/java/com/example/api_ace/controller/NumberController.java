package com.example.api_ace.controller;

import com.example.api_ace.model.NumberResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {

    @GetMapping("/number")
    public NumberResponse getNumber(@RequestParam int n) {
        if (n < 0 || n > 50) {
            throw new IllegalArgumentException("n must be between 0 and 50");
        }

        long result = fibonacci(n);
        return new NumberResponse(result);
    }

    private long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        long fib = 0;
        long prev1 = 1;
        long prev2 = 0;
        for (int i = 2; i <= n; i++) {
            fib = prev1 + prev2;
            prev2 = prev1;
            prev1 = fib;
        }
        return fib;
    }
}
