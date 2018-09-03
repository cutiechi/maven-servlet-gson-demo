package com.cutiechi.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ServiceResult<T> {
    
    private boolean success;
    private String message;
    private T result;
}
