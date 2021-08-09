package com.codewithnk.microservice_demo.controller.api;


import com.codewithnk.microservice_demo.controller.request.AppRequest;
import com.codewithnk.microservice_demo.dto.AppModelDTO;
import com.codewithnk.microservice_demo.dto.mapper.AppModelDTOMapper;
import com.codewithnk.microservice_demo.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class AppController {

    @Autowired
    private AppService service;

    @PostMapping(name = "CreateStudentRecord", value = "/student", consumes = "application/codewithnk.v1+json")
    public ResponseEntity<Integer> createStudentRecordV1(AppRequest request) {
        Integer record = service.createStudentRecord(new AppModelDTOMapper().mapToDTO(request));
        return new ResponseEntity<>(record, HttpStatus.CREATED);
    }

    @GetMapping(name = "GetStudent", value = "/student"  , produces = "application/codewithnk.v1+json")
    public ResponseEntity<AppModelDTO> getStudentV1(@RequestParam() Integer id) {
        AppModelDTO student = new AppModelDTOMapper().mapToDTO(service.getStudent(id));
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping(name = "GetStudents", value = "/students", produces = "application/codewithnk.v1+json")
    public ResponseEntity<List<AppModelDTO>> getStudentsV1() {
        List<AppModelDTO> students =  new AppModelDTOMapper().mapToDTOs(service.getStudents());
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @DeleteMapping(name = "DeleteStudent", value = "/student", produces = "application/codewithnk.v1+json")
    public ResponseEntity<Integer> deleteStudentV1(@RequestParam() Integer id) {
        Integer record = service.deleteStudent(id);
        return new ResponseEntity<>(record, HttpStatus.OK);
    }

    @PutMapping(name = "UpdateStudent", value = "/student", consumes = "application/codewithnk.v1+json")
    public ResponseEntity<Integer> updateStudentV1(AppRequest request) {
        Integer record = service.updateStudent(new AppModelDTOMapper().mapToDTO(request));
        return new ResponseEntity<>(record, HttpStatus.CREATED);
    }
}
