package com.codewithnk.microservice_demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class StudentModel {
    private String fname;
    private String lname;
    private String dob;
}
