package com.imronmaulana.crudstudent.controller;

import com.imronmaulana.crudstudent.entity.Student;
import com.imronmaulana.crudstudent.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student createdStudent = studentService.create(student);
        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
    }

    @GetMapping("")
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getById(id);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) {
        return studentService.update(id, studentDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // Custom query: Find students by NIM
    @GetMapping("/nim/{nim}")
    public List<Student> findStudentsByNim(@PathVariable String nim) {
        return studentService.findStudentsByNim(nim);
    }

    // Custom query: Find students by address
    @GetMapping("/address/{address}")
    public List<Student> findStudentsByAddress(@PathVariable String address) {
        return studentService.findStudentsByAddress(address);
    }
}
