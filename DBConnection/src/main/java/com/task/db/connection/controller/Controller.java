package com.task.db.connection.controller;

import java.util.List;
import java.util.Map;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.db.connection.model.Data;
import com.task.db.connection.service.DataService;

@RestController
@RequestMapping("/data")
public class Controller {
	
	@Autowired
	private DataService dataService;

    
    public Controller(DataService dataService) {
        this.dataService = dataService;
    }

    @PostMapping("/populate")
    public void addData(@RequestBody Data data) {
        dataService.addData(data);
    }
    
    @GetMapping("/{id}")
    public Data getDataById(@PathVariable int id) {
        return dataService.getDataById(id);
    }

    @GetMapping("/all")
    public List<Data> getAllData() {
      return dataService.getAllData();
       
    }
    
    @GetMapping("/nested-json")
    public List<Map<String, Object>> getNestedJsonResponse() {
        return dataService.generateNestedJsonResponse();
    }
	

}
