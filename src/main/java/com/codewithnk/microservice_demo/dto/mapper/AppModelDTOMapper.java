package com.codewithnk.microservice_demo.dto.mapper;

import com.codewithnk.microservice_demo.controller.request.AppRequest;
import com.codewithnk.microservice_demo.dto.AppModelDTO;
import com.codewithnk.microservice_demo.dto.StudentModelDTO;
import com.codewithnk.microservice_demo.dto.SubjectModelDTO;

import java.util.ArrayList;
import java.util.List;


public class AppModelDTOMapper {

    public AppModelDTO mapToDTO(AppRequest request) {
        return new AppModelDTO()
                .setStudent(
                        new StudentModelDTO()
                                .setLname(request.getStudent().getLname())
                                .setFname(request.getStudent().getFname())
                                .setDob(request.getStudent().getDob())
                )
                .setSubject(
                        new SubjectModelDTO()
                                .setName(request.getSubject().getName())
                                .setSection(request.getSubject().getSection())
                                .setTeacher(request.getSubject().getTeacher())
                );
    }

    public AppModelDTO mapToDTO(Object obj) {
        return new AppModelDTO();
    }

    public List<AppModelDTO> mapToDTOs(Object obj) {
        return new ArrayList<>();
    }
}
