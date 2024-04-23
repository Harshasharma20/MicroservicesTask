package com.task.service.baseservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "GreetingService",url = "http://localhost:8083/greeting")
public interface GreetingClient {

    @GetMapping("/getValue")
    public ResponseEntity<String> getGreetings();
}
