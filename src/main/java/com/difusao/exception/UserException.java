package com.difusao.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;

@Getter
@ResponseStatus(value = HttpStatus.NOT_FOUND)
@JsonInclude(value=Include.NON_EMPTY)
public class UserException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String message;
	
	public UserException(String descricao) {
		super(descricao);
	}
}
