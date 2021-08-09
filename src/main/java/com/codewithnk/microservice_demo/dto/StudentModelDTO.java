package com.codewithnk.microservice_demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class StudentModelDTO {
    private String fname;
    private String lname;
    private String dob;
}
