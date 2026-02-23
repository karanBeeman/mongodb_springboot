package com.spring.mongo.project.exceptionhandling;

import com.spring.mongo.project.model.ErrorResponse;
import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmailAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleDuplicateKey(
        EmailAlreadyExistsException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT) // 409
          .body(new ErrorResponse(LocalDateTime.now().toString(), 409, "Duplicate Resource",
              "", ex.getMessage()));
    }
}
