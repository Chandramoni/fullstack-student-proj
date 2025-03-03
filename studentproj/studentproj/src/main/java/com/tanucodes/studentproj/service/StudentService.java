package com.tanucodes.studentproj.service;

import com.tanucodes.studentproj.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Optional<Student> getById(Integer id);
}
