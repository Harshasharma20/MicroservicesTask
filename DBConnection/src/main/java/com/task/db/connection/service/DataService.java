package com.task.db.connection.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.db.connection.log.LogMethodParam;
import com.task.db.connection.model.Data;
import com.task.db.connection.repository.DataRepository;

@Service
public class DataService {
	
	private DataRepository dataRepository;

    @Autowired
    public DataService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public void addData(Data data) {
        dataRepository.save(data);
    }
    
    public Data getDataById(int id) {
        return dataRepository.findById(id).orElse(null);
    }

    //fetch all data 
    public List<Data> getAllData() {
        return dataRepository.findAll();
    }
    
	
	/*
	 * @LogMethodParam public List<Map<String, Object>>
	 * generateNestedJsonResponse1() { List<Map<String, Object>> jsonResponse = new
	 * ArrayList<>();
	 * 
	 * // Logic to generate nested JSON response // You can replace this with your
	 * /// actual implementation
	 * 
	 * return jsonResponse; }
	 */
	 
    
    @LogMethodParam
    public List<Map<String, Object>> generateNestedJsonResponse() {
        List<Map<String, Object>> jsonResponse = new ArrayList<>();

        // Create a map to hold class names and their subclasses
        Map<String, List<String>> classMap = new HashMap<>();
        classMap.put("Wizard", List.of("Mage", "Specialist wizard"));
        classMap.put("Priest", List.of("Cleric", "Druid", "Priest of specific mythos"));
        classMap.put("Warrior", List.of("Fighter", "Paladin", "Ranger"));
        classMap.put("Rogue", List.of("Thief", "Bard"));

        // Iterate over the classMap and generate the nested JSON response
        for (String className : classMap.keySet()) {
            Map<String, Object> classObject = new HashMap<>();
            classObject.put("Name", className);

            List<Map<String, Object>> subClasses = new ArrayList<>();
            for (String subClassName : classMap.get(className)) {
                Map<String, Object> subClassObject = new HashMap<>();
                subClassObject.put("Name", subClassName);
                subClasses.add(subClassObject);
            }

            classObject.put("Sub Classes", subClasses);
            jsonResponse.add(classObject);
        }

        return jsonResponse;
    }
    
}
