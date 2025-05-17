package com.colvir.webinar5.exception;

import com.colvir.webinar5.exception.dto.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalApiExceptionHandler {
    @ExceptionHandler({IllegalArgumentException.class})
    public ResponseEntity<ErrorResponseDto> exceptionHandled(IllegalArgumentException exc) {
        return ResponseEntity.badRequest().body(new ErrorResponseDto(exc.getMessage(), HttpStatus.BAD_REQUEST.value()));
    };

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<ErrorResponseDto> exceptionHandled(MethodArgumentNotValidException exc) {
        return ResponseEntity.badRequest().body(new ErrorResponseDto(exc.getMessage(), HttpStatus.BAD_REQUEST.value()));
    };
}
