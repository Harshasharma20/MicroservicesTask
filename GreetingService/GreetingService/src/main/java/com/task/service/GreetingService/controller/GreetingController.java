package com.task.service.GreetingService.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/greeting")
@Tag(name="Greeting Controller",description="This is Greeting Controller")
public class GreetingController {
	
	Logger logger = LoggerFactory.getLogger(GreetingController.class);

    @GetMapping("/getValue")
    public ResponseEntity<String> getGreetings(){
    	// Log traceID before method call
        logger.trace("GET /status called");
        return ResponseEntity.ok("Hello");
    }
}
