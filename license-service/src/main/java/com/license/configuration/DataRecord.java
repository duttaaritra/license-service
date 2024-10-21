package com.license.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "data")
public record DataRecord(String name, int age, String dob, String address) {

}
