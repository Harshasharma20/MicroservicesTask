package com.tast.service.ParserService.controller;

import com.tast.service.ParserService.model.JsonRequestModel;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parser")
@Tag(name="Parser Controller",description="This is Parser Controller")
public class ParserController {
	
	Logger logger = LoggerFactory.getLogger(ParserController.class);

    @PostMapping(value = "/parseJson")
    public ResponseEntity<String> parseJson(@RequestBody JsonRequestModel requestModel){
    	// Log traceID before method call
        logger.trace("GET /status called");
       //StringBuilder stringBuilder = new StringBuilder();
        return ResponseEntity.ok(requestModel.getGreeting() +" "+ requestModel.getName() +" "+ requestModel.getSurname());
    }
}
