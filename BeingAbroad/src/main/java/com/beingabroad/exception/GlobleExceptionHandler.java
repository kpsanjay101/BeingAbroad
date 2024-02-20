package com.beingabroad.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobleExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> GeneralExceptionHandler(Exception se){
		return new ResponseEntity<>(se.getMessage() , HttpStatus.BAD_REQUEST) ;
	}
	
	@ExceptionHandler(InstituteNotFoundException.class)
	public ResponseEntity<String> ExceptionHandler(InstituteNotFoundException se){
		
		return new ResponseEntity<>(se.getMessage() , HttpStatus.BAD_REQUEST) ;
	}
	@ExceptionHandler(InstituteAlreadyExistException.class)
	public ResponseEntity<String> ExceptionHandler(InstituteAlreadyExistException se){
		
		return new ResponseEntity<>(se.getMessage() , HttpStatus.BAD_REQUEST) ;
	}
	
	
//	@ExceptionHandler(AdminAlreadyExistsException.class)
//	public ResponseEntity<String> ExceptionHandler(AdminAlreadyExistsException se){
//		
//		return new ResponseEntity<>(se.getMessage() , HttpStatus.BAD_REQUEST) ;
//	}
//	@ExceptionHandler(AdminNotFoundException.class)
//	public ResponseEntity<String> ExceptionHandler(AdminNotFoundException se){
//		
//		return new ResponseEntity<>(se.getMessage() , HttpStatus.BAD_REQUEST) ;
//	}
	
	
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<String> NoHandelerExceptionHandler(NoHandlerFoundException se){
		return new ResponseEntity<>("There is no handler for this endpoint" , HttpStatus.BAD_REQUEST) ;
	}

}
