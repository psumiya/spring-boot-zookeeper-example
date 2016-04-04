package com.example.boot.diner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * The Spring Boot Diner Application.
 * <p>
 * This class provides the main method to launch the Spring Boot Diner
 * Application. The default configuration:
 * <ol>
 * <li>Launches Server on Port 8081</li>
 * <li>Searches for a ZooKeeper instance on Port 2181</li>
 * <li>Registers the Services on this Application with ZooKeeper under the name
 * <b>diner</b></li>
 * </p>
 * <p>
 * The Diner Application launches a simple REST<i>ful</i> service to indicate
 * whether or not the diner is open on a day.
 * </p>
 * 
 * @author sumiyapathak
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DinerApplication {

	/**
	 * Launch the Diner Application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DinerApplication.class, args);
	}
}
