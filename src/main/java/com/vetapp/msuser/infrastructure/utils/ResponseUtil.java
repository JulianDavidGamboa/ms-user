package com.vetapp.msuser.infrastructure.utils;

import org.springframework.http.ResponseEntity;

public class ResponseUtil {
    public static <T> ResponseEntity<ApiResponse<T>> success(String message, T data) {
        return ResponseEntity.ok(ApiResponse.success(message, data));
    }

    public static <T> ResponseEntity<ApiResponse<T>> error(String message, T data) {
        return ResponseEntity.badRequest().body(ApiResponse.error(message, data));
    }
}
