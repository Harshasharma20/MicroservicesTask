package com.task.service.baseservice.client;

import com.task.service.baseservice.model.JsonRequestModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "ParserService",url = "http://localhost:8084/parser")
public interface ParserClient {

    @PostMapping(value = "/parseJson")
    ResponseEntity<String> parseJson(@RequestBody JsonRequestModel requestModel);
}
