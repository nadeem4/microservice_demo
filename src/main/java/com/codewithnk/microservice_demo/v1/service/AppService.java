package com.codewithnk.microservice_demo.v1.service;

import com.codewithnk.microservice_demo.v1.dto.AppModelDTO;
import com.codewithnk.microservice_demo.v1.model.mapper.AppModelMapper;
import com.codewithnk.microservice_demo.v1.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {

    @Autowired
    private AppRepository repository;

    public boolean createStudentRecord(AppModelDTO dto) {
        return repository.createStudentRecord(new AppModelMapper().mapToModel(dto));
    }
}
