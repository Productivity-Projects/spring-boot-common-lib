package com.springbootcommonlib.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(value = Include.NON_NULL)
public class Response {

	Object data;
	Integer count;
	String details;
	String errorMessage;
}
