package com.codewithnk.microservice_demo.v1.controller.api;


import com.codewithnk.microservice_demo.v1.controller.request.AppRequest;
import com.codewithnk.microservice_demo.v1.dto.mapper.AppModelDTOMapper;
import com.codewithnk.microservice_demo.v1.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Autowired
    private AppService service;

    @PostMapping(name = "CreateStudentRecord", value = "/student-record")
    public ResponseEntity createStudentRecord(AppRequest request) {
        boolean recordCreated = service.createStudentRecord(new AppModelDTOMapper().mapToModel(request));
        if (recordCreated) return new ResponseEntity(HttpStatus.CREATED);
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
}
