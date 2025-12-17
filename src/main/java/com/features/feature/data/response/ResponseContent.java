package com.features.feature.data.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseContent<T> {
    @JsonProperty("data")
    private T content;
    private String message;
    private Boolean status;
    private Integer code;

    public ResponseContent(String message, Boolean status, Integer code) {
        this.message = message;
        this.status = status;
        this.code = code;
    }
}
