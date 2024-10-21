package com.license.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.license.model.License;
import com.license.service.LicenseService;

@RestController
@RequestMapping(value = "/v1/orzanization/{organizationId}/license")
public class LicenseController {
	
	@Autowired
	LicenseService licenseService;
	
	@GetMapping(value="/{licenseId}")                              
	  public ResponseEntity<License> getLicense(
	     @PathVariable("organizationId") String organizationId,
	     @PathVariable("licenseId") String licenseId) {              

	     License license = licenseService
	         .getLicense(licenseId,organizationId);                  
	       return ResponseEntity.ok(license);
	  }

}
