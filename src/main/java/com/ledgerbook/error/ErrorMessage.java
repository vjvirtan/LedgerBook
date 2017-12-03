package com.ledgerbook.error;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;

public class ErrorMessage {

	private HttpStatus errorCode;
	private String message;
	private List<String> errors;

	public ErrorMessage(HttpStatus errorCode, String message, String errors) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.errors = Arrays.asList(errors);
	}

	public ErrorMessage(HttpStatus errorCode, String message, List<String> errors) {
		super();
		this.errorCode = errorCode;
		this.message = message;
		this.errors = errors;
	}

	public ErrorMessage() {
	}

	public HttpStatus getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(HttpStatus errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getErrors() {
		return errors;
	}

	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

}
