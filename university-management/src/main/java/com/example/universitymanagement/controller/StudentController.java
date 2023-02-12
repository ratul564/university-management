package com.example.universitymanagement.controller;

import com.example.universitymanagement.model.Student;
import com.example.universitymanagement.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/student-app")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("find-all")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("find/student_id/{student_id}")
    public Student findById(@PathVariable int student_id){
        return studentService.findById(student_id);
    }

    @PostMapping("add-student")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @PutMapping("update_student/student_id/{student_id}")
    public void updateStudent(@PathVariable int student_id,@RequestBody Student student){
        studentService.updateStudent(student_id,student);
    }

    @DeleteMapping("delete-student/student_id/{student_id}")
    public void deleteStudent(@PathVariable int student_id){
       studentService.deleteStudent(student_id);
    }
}
