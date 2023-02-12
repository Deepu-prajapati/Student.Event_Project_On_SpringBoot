package com.example.student.Student.controller;

import com.example.student.Student.model.StudentInfo;
import com.example.student.Student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student-Info")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("Get-all-student")
    public List<StudentInfo> findAllStudent(){
        return studentService.findAll();
    }
    @GetMapping("/Get-Student-by-id/studentId/{studentId}")
    public StudentInfo findById(@PathVariable int studentId){
        return studentService.findByStudentId(studentId);
    }
    @DeleteMapping("delete-student/studentId/{studentId}")
    public void deleteStudentInfo(@PathVariable int studentId){
        studentService.deleteInfo(studentId);
    }
    @PostMapping("add-student")
    public void addStudent(@RequestBody StudentInfo students){
        studentService.addStudentById(students);
    }

    @PutMapping("update-student/studentId/{studentId}")
    public void updateStudentInfo(@PathVariable int studentId,@RequestBody StudentInfo student){
        studentService.updateStudent(studentId, student);
    }

}
