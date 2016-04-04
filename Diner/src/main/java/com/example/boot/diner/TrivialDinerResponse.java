package com.example.boot.diner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * A Trivial Diner Response.
 * 
 * @author sumiyapathak
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class TrivialDinerResponse {

	/**open or closed**/
	private String status;

}
