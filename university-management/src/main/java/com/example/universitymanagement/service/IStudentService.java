package com.example.universitymanagement.service;

import com.example.universitymanagement.model.Student;

import java.util.List;

public interface IStudentService {
    public List<Student> findAll();
    public Student findById(int student_id);
    public void addStudent(Student student);
    public void updateStudent(int student_id,Student newStudent);
    public void deleteStudent(int student_id);
}
