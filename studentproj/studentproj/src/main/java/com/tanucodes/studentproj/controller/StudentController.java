package com.tanucodes.studentproj.controller;

import com.tanucodes.studentproj.model.Student;
import com.tanucodes.studentproj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "new student added";
    }
    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();

    }
    @GetMapping(value="/getStudent/{id}")
    public Optional<Student> getStudent(@PathVariable Integer id) {
        return studentService.getById(id);
    }
}
