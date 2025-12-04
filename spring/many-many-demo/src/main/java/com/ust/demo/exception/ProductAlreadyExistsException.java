package com.ust.demo.exception;

public class ProductAlreadyExistsException extends Exception {
	public ProductAlreadyExistsException(String message) {
		super(message);
	}
}
