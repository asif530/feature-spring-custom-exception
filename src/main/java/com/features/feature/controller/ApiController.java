package com.features.feature.controller;

import com.features.feature.exception.ArithmeticException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ApiController {

    @GetMapping
    public ResponseEntity<String> response() {
        String response = "Hello World";
        try {
            int i = 10 / 0;
        } catch (Exception e) {
            throw new ArithmeticException(e.getMessage() , e);
        }
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
