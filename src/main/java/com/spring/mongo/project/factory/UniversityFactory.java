package com.spring.mongo.project.factory;

import com.spring.mongo.project.service.UniversityService;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class UniversityFactory {

    private final Map<String, UniversityService> serviceMap;

    public UniversityFactory(Map<String, UniversityService> serviceMap) {
        this.serviceMap = serviceMap;
    }

    public UniversityService get(String college) {
        UniversityService service = serviceMap.get(college);
        if(service == null) {
            throw new IllegalArgumentException("Invalid college: " + college);
        }
        return service;
    }
}
