package com.codewithnk.microservice_demo.v1.repository;

import com.codewithnk.microservice_demo.v1.model.AppModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

@Repository
public class AppRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private SimpleJdbcCall simpleJdbcCall;

    public boolean createStudentRecord(AppModel model) {
        simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("create_student_record");
        SqlParameterSource in = new MapSqlParameterSource()
                .addValue("student_fname", model.getStudent().getFname())
                .addValue("student_lname", model.getStudent().getLname())
                .addValue("student_dob", model.getStudent().getDob())
                .addValue("subject_name", model.getSubject().getName())
                .addValue("subject_section", model.getSubject().getSection())
                .addValue("subject_teacher", model.getSubject().getTeacher());
        simpleJdbcCall.execute(in);

        return true;
    }
}
