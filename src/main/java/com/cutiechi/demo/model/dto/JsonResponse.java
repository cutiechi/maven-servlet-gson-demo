package com.cutiechi.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
public class JsonResponse {
    
    private Integer code;
    private String message;
    private Object data;
    
    public enum Status {
        SUCCESS(200, "OK");
        
        private Integer code;
        private String message;
        
        Status (Integer code, String message) {
            this.code = code;
            this.message = message;
        }
        
        public Integer getCode () {
            return code;
        }
        
        public String getMessage () {
            return message;
        }
    }
}
