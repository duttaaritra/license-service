package com.license.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.license.configuration.DataRecord;
import com.license.model.License;
import com.license.service.LicenseService;

@RestController
@RequestMapping(value = "/v1/properties")
public class PropertiesReadController {
	
	@Autowired
	LicenseService licenseService;
	
	@Autowired
	private DataRecord record;
	
	@GetMapping(value="/get")                              
	  public ResponseEntity<Map> getLicense() {              

		Map<String, String> dataMap = new HashMap<>();
		dataMap.put("Name", record.name());
	    dataMap.put("Age", String.valueOf(record.age()));
	    dataMap.put("DOB", record.dob());
	    dataMap.put("Address", record.address());
	    
	       return ResponseEntity.ok(dataMap);
	  }

}
