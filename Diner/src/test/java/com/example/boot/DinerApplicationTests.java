package com.example.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.boot.diner.DinerApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DinerApplication.class)
@WebAppConfiguration
public class DinerApplicationTests {

	@Test
	public void contextLoads() {
	}

}
