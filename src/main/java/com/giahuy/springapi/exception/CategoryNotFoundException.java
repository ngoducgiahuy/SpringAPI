package com.giahuy.springapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CategoryNotFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2278600984577119782L;

	public CategoryNotFoundException(String message) {
		super(message);
		
	}

	

}
