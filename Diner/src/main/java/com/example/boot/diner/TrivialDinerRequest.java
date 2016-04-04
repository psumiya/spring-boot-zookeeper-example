package com.example.boot.diner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * A Trivial Diner Request.
 * 
 * @author sumiyapathak
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data public class TrivialDinerRequest {

	/**The Day of Week, 1 = Sunday, 2, 3, ...**/
	private String day;
	
}
