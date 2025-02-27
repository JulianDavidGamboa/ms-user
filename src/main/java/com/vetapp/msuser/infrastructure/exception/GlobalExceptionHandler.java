package com.vetapp.msuser.infrastructure.exception;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.vetapp.msuser.domain.exception.UserAlreadyExistsException;
import com.vetapp.msuser.infrastructure.utils.ResponseUtil;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<?> handleUserNotFoundException(UserAlreadyExistsException ex) {
        return ResponseUtil.error(ex.getMessage(), Map.of("exists", false));
    }

}
