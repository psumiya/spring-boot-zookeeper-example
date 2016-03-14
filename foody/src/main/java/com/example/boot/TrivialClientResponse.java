package com.example.boot;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data public class TrivialClientResponse {

	private String status;
	
}
