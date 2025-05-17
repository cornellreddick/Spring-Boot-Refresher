package com.springboottrn.demo.service;

import com.springboottrn.demo.dao.StudentDao;
import com.springboottrn.demo.model.Student;

import java.util.List;
import java.util.UUID;

public class StudentService {

    private final StudentDao studentDao;

    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }


    public int persistNewStudent(UUID studentId, Student student) {
        UUID studentUuid = studentId == null ? UUID.randomUUID() : studentId;
        return studentDao.insertNewStudent(studentUuid, student);
    }

    public Student geStudentById(UUID studentId) {
        return studentDao.selectStudentById(studentId);
    }

    public List<Student> getAllStudents() {
        return studentDao.selectAllStudents();
    }

    public int updateStudentById(UUID studentId, Student studentUpdate) {
        return studentDao.updateStudentById(studentId, studentUpdate);
    }

    public int deleteStudentById(UUID studentId) {
        return studentDao.deleteStudentById(studentId);
    }
}
