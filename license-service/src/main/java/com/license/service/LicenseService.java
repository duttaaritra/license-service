package com.license.service;

import com.license.model.License;

public interface LicenseService {

	String createLicense(License license, String organizationId);

	License getLicense(String licenseId, String organizationId);

	String updateLicense(License license, String organizationId);

	String deleteLicense(String licenseId, String organizationId);

}
