package com.example.boot;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data public class TrivialClientRequest {

	private String day;
	
}
