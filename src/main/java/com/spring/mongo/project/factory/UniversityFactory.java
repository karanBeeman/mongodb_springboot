package com.spring.mongo.project.factory;

import com.spring.mongo.project.enums.CollegeType;
import com.spring.mongo.project.service.UniversityService;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

@Component
public class UniversityFactory {

    // @Service("DELHI") below works but it is not type safe and can lead to runtime errors if the string is misspelled.
//    private final Map<String, UniversityService> serviceMap;

//    public UniversityFactory(Map<String, UniversityService> serviceMap) {
//        this.serviceMap = serviceMap;
//    }
//
//    public UniversityService get(String college) {
//        UniversityService service = serviceMap.get(college);
//        if(service == null) {
//            throw new IllegalArgumentException("Invalid college: " + college);
//        }
//        return service;
//    }

    private final Map<CollegeType, UniversityService> serviceMap;

    public UniversityFactory(List<UniversityService> services) {

        this.serviceMap = services.stream()
            .collect(Collectors.toMap(
                UniversityService::getCollegeType,
                s -> s
            ));
    }

    public UniversityService get(CollegeType college) {

        UniversityService service = serviceMap.get(college);

        if (service == null) {
            throw new IllegalArgumentException(
                "Invalid college: " + college
            );
        }

        return service;
    }
}
