package com.example.student.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorResponse {
	
	private LocalDateTime timestamp;
	
	private String message;
	
	private int status;

}
