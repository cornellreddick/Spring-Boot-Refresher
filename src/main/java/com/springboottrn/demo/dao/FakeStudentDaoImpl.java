package com.springboottrn.demo.dao;

import com.springboottrn.demo.model.Student;

import java.util.List;
import java.util.UUID;

public class FakeStudentDaoImpl implements StudentDao{
    @Override
    public int insertNewStudent(UUID studentId, Student student) {
        return 0;
    }

    @Override
    public Student selectStudentById(UUID studentId) {
        return null;
    }

    @Override
    public List<Student> selectAllStudents() {
        return List.of();
    }

    @Override
    public int updateStudentById(UUID studentId, Student newStudent) {
        return 0;
    }

    @Override
    public int deleteStudentById(UUID studentId) {
        return 0;
    }
}
