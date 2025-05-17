package com.springboottrn.demo.dao;

import com.springboottrn.demo.model.Student;

import java.util.*;

public class FakeStudentDaoImpl implements StudentDao {

    //Fake Database
    private final Map<UUID, Student> database;


    public FakeStudentDaoImpl() {
        database = new HashMap<>();
    }

    @Override
    public int insertNewStudent(UUID studentId, Student student) {
        database.put(studentId, student);
        return 1;
    }

    @Override
    public Student selectStudentById(UUID studentId) {
        return database.get(studentId);
    }

    @Override
    public List<Student> selectAllStudents() {
        return new ArrayList<>(database.values());
    }

    @Override
    public int updateStudentById(UUID studentId, Student studentUpdate) {
        database.put(studentId, studentUpdate);
        return 1;
    }

    @Override
    public int deleteStudentById(UUID studentId) {
        database.remove(studentId);
        return 1;
    }
}
