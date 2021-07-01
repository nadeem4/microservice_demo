package com.codewithnk.microservice_demo.v1.dto.mapper;

import com.codewithnk.microservice_demo.v1.controller.request.AppRequest;
import com.codewithnk.microservice_demo.v1.dto.AppModelDTO;
import com.codewithnk.microservice_demo.v1.dto.StudentModelDTO;
import com.codewithnk.microservice_demo.v1.dto.SubjectModelDTO;


public class AppModelDTOMapper {

    public AppModelDTO mapToModel(AppRequest request) {
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
}
