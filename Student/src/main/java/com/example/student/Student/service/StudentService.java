package com.example.student.Student.service;


import com.example.student.Student.model.StudentInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements IStudentService {

    static List<StudentInfo> student = new ArrayList<>();
    static int id = 0;

    static{
        student.add(new StudentInfo(++id,"Deepak","Prajapati",20,"Mechanical"));
        student.add(new StudentInfo(++id,"Manish","Rathore",20,"Civil"));
        student.add(new StudentInfo(++id,"Harish","Makode",20,"Computer Science"));
        student.add(new StudentInfo(++id,"Aman","Kumavat",20,"Information technology"));
        student.add(new StudentInfo(++id,"Lakhan","Choudhary",20,"Mechanical"));
    }

    @Override
    public List<StudentInfo> findAll(){
        return student;
    }
    public StudentInfo findByStudentId(int id){
        for(StudentInfo students:student){
            if(students.getStudentId()==id){
                return students;
            }
        }
        return null;
    }
    public void deleteInfo(int id){
        student.removeIf(StudentInfo -> StudentInfo.getStudentId()== id);
    }

    public void addStudentById(StudentInfo students){
        student.add(students);
    }
    public void updateStudent(int studentId,StudentInfo newStudentInfo){

        StudentInfo student = findByStudentId(id);

        student.setStudentId(newStudentInfo.getStudentId());
        student.setFirstName(newStudentInfo.getFirstName());
        student.setLastName(newStudentInfo.getLastName());
        student.setAge(newStudentInfo.getAge());
        student.setDepartment(newStudentInfo.getDepartment());
    }

}
