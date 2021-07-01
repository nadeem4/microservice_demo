package com.codewithnk.microservice_demo.v1.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class AppModel {
    private StudentModel student;
    private SubjectModel subject;
}

