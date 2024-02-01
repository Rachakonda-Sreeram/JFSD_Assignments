package com.hexaware.springrestjpa2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PaymentExceptionHandler {
	@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="Payment Not Found")
	@ExceptionHandler(PaymentNotFoundException.class)
	public void Handler() {}

}
