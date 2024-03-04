package com.hexaware.cricket.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PlayerExceptionHandler {
	
	@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="Player Not Found")
	@ExceptionHandler({PlayerNotFound.class})
	public void Handler() {}

}
