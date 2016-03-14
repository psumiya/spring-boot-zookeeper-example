package com.example.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodyController {

	private static final Logger logger = LoggerFactory.getLogger(FoodyController.class);
	
	@Autowired
	private DinerClient dinerClient;

	@RequestMapping(path = "/foody/mydiner", method=RequestMethod.POST)
	public TrivialClientResponse findDinerStatus(@RequestBody TrivialClientRequest request) {
		logger.info("findDinerStatus::day=" + request.getDay());
		return dinerClient.testDay(request);
	}

}
