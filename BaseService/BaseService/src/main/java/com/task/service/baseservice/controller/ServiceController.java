package com.task.service.baseservice.controller;

import com.task.service.baseservice.client.ParserClient;
import com.task.service.baseservice.model.JsonRequestModel;

import io.swagger.v3.oas.annotations.tags.Tag;

import com.task.service.baseservice.client.GreetingClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/service1")
@Tag(name="Service Controller", description="This is Service Controller")
public class ServiceController {
	
	Logger logger = LoggerFactory.getLogger(ServiceController.class);
	

    private final GreetingClient greetingClient;
    private final ParserClient parserClient;

    @Autowired
    public ServiceController(GreetingClient greetingClient,
                             ParserClient parserClient){
        this.greetingClient = greetingClient;
        this.parserClient = parserClient;
    }

    @GetMapping(value = "/getStatus")
    public ResponseEntity<String> getApplicationStatus(){
    	// Log traceID before method call
        logger.trace("GET /status called");
        return ResponseEntity.ok("Up");
    }

    @PostMapping(value = "/prepareResponse")
    public ResponseEntity<String> preparseResponse(@RequestBody JsonRequestModel requestModel){
    	 // Log traceID before method call
        logger.trace("POST /status called");
        ResponseEntity<String> greetings = greetingClient.getGreetings();
        requestModel.setGreeting(greetings.getBody());
        return parserClient.parseJson(requestModel);
    }
}
