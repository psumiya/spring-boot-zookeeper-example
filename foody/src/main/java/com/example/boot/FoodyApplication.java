package com.example.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The Spring Boot Foody Application.
 * <p>
 * This class provides the main method to launch the Spring Boot Foody
 * Application. The default configuration:
 * <ol>
 * <li>Launches Server on Port 8083</li>
 * <li>Searches for a ZooKeeper instance on Port 2181</li>
 * <li>Registers the Services on this Application with ZooKeeper under the name
 * <b>foody</b></li>
 * </p>
 * <p>
 * The Foody Application launches a simple REST<i>ful</i> service to indicate
 * whether or not the foody's favorite diner is open on a day.
 * </p>
 * 
 * @author sumiyapathak
 *
 */
@SpringBootApplication
public class FoodyApplication {

	/**
	 * Launch the Foody Application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(FoodyApplication.class, args);
	}
	
}
