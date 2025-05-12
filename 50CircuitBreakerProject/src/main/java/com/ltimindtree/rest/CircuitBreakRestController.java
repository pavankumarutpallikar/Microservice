package com.ltimindtree.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class CircuitBreakRestController {

	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod = "getDataByDB", name = "pavan")
	public String getDataByRedis() {
		System.out.println("CircuitBreakRestController.getData() fromr Redis Server..........................");
			
		int a = 110 / 0;
		
		return "Data fetched from Redis";
	}

	public String getDataByDB(Throwable T) {
		System.out.println("CircuitBreakRestController.getDataDB() fetched Data from Data base Server.............");

		return "Data fetched From DB";

	}
}
