package com.example.universitymanagement.service;

import com.example.universitymanagement.model.Student;
import com.example.universitymanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class StudentService implements IStudentService{

    @Autowired
    private StudentRepository studentRepository;

    private List<Student> students = new ArrayList<>();

    static{

    }

    @Override
    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int student_id){
        return studentRepository.findById(student_id).get();
    }

    @Override
    public void addStudent(Student student){
       studentRepository.save(student);
    }

    @Override
    public void updateStudent(int student_id,Student newStudent){

       Student student = studentRepository.findById(student_id).get();

       student.setStudent_id(newStudent.getStudent_id());
       student.setFirst_name(newStudent.getFirst_name());
       student.setLast_name(newStudent.getLast_name());
       student.setAge(newStudent.getAge());
       student.setDepartment(newStudent.getDepartment());

       studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int student_id){
       studentRepository.deleteById(student_id);
    }
}
