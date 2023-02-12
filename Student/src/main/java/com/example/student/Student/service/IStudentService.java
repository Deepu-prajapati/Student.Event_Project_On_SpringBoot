package com.example.student.Student.service;

import com.example.student.Student.model.StudentInfo;

import java.util.List;

public interface IStudentService {

    public List<StudentInfo> findAll();

    public StudentInfo findByStudentId(int id);

    public void deleteInfo(int id);

    public void addStudentById(StudentInfo students);

    public void updateStudent(int studentId,StudentInfo newStudentInfo);

}
