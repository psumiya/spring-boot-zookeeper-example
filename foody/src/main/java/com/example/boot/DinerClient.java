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

@Configuration
@EnableFeignClients
@EnableDiscoveryClient
public class DinerClient {

	@Autowired
	private TheClient theClient;

	@FeignClient(name = "diner")
	interface TheClient {
		@RequestMapping(value = "/diner/isopen", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
		@ResponseBody TrivialClientResponse isOpen(@RequestBody TrivialClientRequest request);
	}

	public TrivialClientResponse testDay(TrivialClientRequest request) {
		return theClient.isOpen(request);
	}

}
