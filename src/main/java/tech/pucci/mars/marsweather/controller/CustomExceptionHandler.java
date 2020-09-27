package tech.pucci.mars.marsweather.controller;

import org.json.JSONException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import tech.pucci.mars.marsweather.model.CustomErrorDTO;

@RestControllerAdvice
public class CustomExceptionHandler {

	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(JSONException.class)
	public CustomErrorDTO handle(JSONException exception) {
		return new CustomErrorDTO(HttpStatus.INTERNAL_SERVER_ERROR.name());
	}
}
