package com.codewithnk.microservice_demo.v1.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class SubjectModelDTO {
    private String name;
    private String section;
    private String teacher;
}
