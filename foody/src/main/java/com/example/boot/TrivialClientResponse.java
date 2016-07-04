package com.example.boot;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * A trivial client response to map the diner response properties.
 * 
 * @author sumiyapathak
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class TrivialClientResponse {

	private String status;

}
