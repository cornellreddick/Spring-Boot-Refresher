package com.springboottrn.demo.resource;

import com.springboottrn.demo.model.Student;
import com.springboottrn.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/students")
public class StudentResource {

    private final StudentService studentService;

    @Autowired
    public StudentResource(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public void insertNewStudent(@RequestBody Student student){
        studentService.persistNewStudent(UUID.randomUUID(), student);
    }

}
