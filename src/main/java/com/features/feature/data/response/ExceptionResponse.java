package com.features.feature.data.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResponse {
    private String message;
    private boolean status;
    private Integer code;

    public ExceptionResponse(String message, HttpStatus httpStatus) {
        this.message = message;
        this.code = httpStatus.value();
        this.status = false;
    }
}
