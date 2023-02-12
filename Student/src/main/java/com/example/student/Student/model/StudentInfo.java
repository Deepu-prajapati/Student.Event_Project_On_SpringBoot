package com.example.student.Student.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentInfo {
    private int studentId;
    private String firstName;
    private String lastName;
    private int age;
    private String department;
}
