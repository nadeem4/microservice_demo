package com.codewithnk.microservice_demo.service;

import com.codewithnk.microservice_demo.dto.AppModelDTO;
import com.codewithnk.microservice_demo.model.mapper.AppModelMapper;
import com.codewithnk.microservice_demo.repository.AppRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Map;

@Service
public class AppService {

    @Autowired
    private AppRepository repository;

    public Integer createStudentRecord(AppModelDTO dto) {
        Map<String, Object> out = repository.createStudentRecord(new AppModelMapper().mapToModel(dto));
        ObjectMapper mapper = new ObjectMapper();
        return (Integer) (mapper.convertValue(((ArrayList<?>) out.get("#result-set-1")).get(0), Map.class)).get("id");
    }

    public Integer updateStudent(AppModelDTO dto) {
        Map<String, Object> out = repository.createStudentRecord(new AppModelMapper().mapToModel(dto));
        ObjectMapper mapper = new ObjectMapper();
        return (Integer) (mapper.convertValue(((ArrayList<?>) out.get("#result-set-1")).get(0), Map.class)).get("id");
    }

    public Object getStudent(Integer id) {
        Map<String, Object> out = repository.getStudent(id);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.convertValue(((ArrayList<?>) out.get("#result-set-1")).get(0), Map.class);
    }

    public Integer deleteStudent(Integer id) {
        Map<String, Object> out = repository.deleteStudent(id);
        ObjectMapper mapper = new ObjectMapper();
        return (Integer) mapper.convertValue(((ArrayList<?>) out.get("#result-set-1")).get(0), Map.class).get("id");
    }

    public Object getStudents() {
        Map<String, Object> out = repository.getStudents();
        return (ArrayList<?>) out.get("#result-set-1");
    }
}
