package br.com.alura.api.exception;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity notFoundEntity(){
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity notValid(MethodArgumentNotValidException exception){
        var errors = exception.getFieldErrors();
        return ResponseEntity.badRequest().body(errors.stream().map(errorDTO::new).toList());
    }

    @ExceptionHandler(BusinessRuleException.class)
    public ResponseEntity<DataErrorAPI> handleBusinessRuleException(BusinessRuleException ex) {
        return ResponseEntity.badRequest().body(new DataErrorAPI(ex.getMessage()));
    }

    private record errorDTO(String campo, String msg){
        public errorDTO(FieldError error){
            this(error.getField(), error.getDefaultMessage());
        }
    }
}
