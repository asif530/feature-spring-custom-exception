package com.features.feature.exception.handler;

import com.features.feature.data.response.ExceptionResponse;
import com.features.feature.exception.ArithmeticException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequiredArgsConstructor
public class ApiExceptionHandler {

    @ExceptionHandler(ArithmeticException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ExceptionResponse exception(Exception exception) {
        System.out.println("Exception caught in ArithmeticException");
        return new ExceptionResponse(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
