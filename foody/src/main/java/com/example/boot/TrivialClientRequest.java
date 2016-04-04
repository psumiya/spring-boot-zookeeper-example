package com.example.boot;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * A trivial client request to map the diner request properties.
 * 
 * @author sumiyapathak
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class TrivialClientRequest {

	private String day;

}
