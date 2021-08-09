package com.codewithnk.microservice_demo.model.mapper;

import com.codewithnk.microservice_demo.dto.AppModelDTO;
import com.codewithnk.microservice_demo.model.AppModel;
import com.codewithnk.microservice_demo.model.StudentModel;
import com.codewithnk.microservice_demo.model.SubjectModel;

public class AppModelMapper {

    public AppModel mapToModel(AppModelDTO dto) {
        return new AppModel()
                .setStudent(
                        new StudentModel()
                                .setLname(dto.getStudent().getLname())
                                .setFname(dto.getStudent().getFname())
                                .setDob(dto.getStudent().getDob())
                )
                .setSubject(
                        new SubjectModel()
                                .setName(dto.getSubject().getName())
                                .setSection(dto.getSubject().getSection())
                                .setTeacher(dto.getSubject().getTeacher())
                );
    }
}
