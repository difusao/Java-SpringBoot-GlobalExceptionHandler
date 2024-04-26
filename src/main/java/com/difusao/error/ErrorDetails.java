package com.difusao.error;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ErrorDetails {
	private String message;

	public ErrorDetails(String message) {
		super();
		
		this.message = message;
	}
}