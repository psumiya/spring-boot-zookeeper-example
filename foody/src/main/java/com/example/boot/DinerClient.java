package com.example.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * This class provides operations on the diner service.
 * 
 * <p>
 * When booting up, Spring will try and find a service named "diner" (see the
 * FeignClient below) under the available ZooKeeper instance.
 * </p>
 * 
 * @author sumiyapathak
 *
 */
@Configuration
@EnableFeignClients
@EnableDiscoveryClient
public class DinerClient {

	@Autowired
	private TheClient theClient;

	/**
	 * Create a REST-ful client to connect to the "diner" service available on
	 * ZooKeeper.
	 *
	 */
	@FeignClient(name = "diner")
	interface TheClient {
		@RequestMapping(value = "/diner/isopen", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
		@ResponseBody
		TrivialClientResponse isOpen(@RequestBody TrivialClientRequest request);
	}

	/**
	 * Initiate call to diner.
	 * 
	 * @param request
	 * @return the response
	 */
	public TrivialClientResponse testDay(TrivialClientRequest request) {
		return theClient.isOpen(request);
	}

}
