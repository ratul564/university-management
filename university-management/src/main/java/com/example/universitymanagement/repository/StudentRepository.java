package com.example.universitymanagement.repository;

import com.example.universitymanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
//    Object findAllById(int student_id);

}
