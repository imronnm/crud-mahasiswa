package com.imronmaulana.crudstudent.service;

import com.imronmaulana.crudstudent.entity.Student;
import com.imronmaulana.crudstudent.exception.ResourceNotFoundException;
import com.imronmaulana.crudstudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student create(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public Student getById(Long id) {
        return studentRepository.findById(id).orElseThrow(() ->
        new ResourceNotFoundException("Student not found with id " + id));
    }

    public Student update(Long id, Student studentDetails) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id " + id));
        student.setName(studentDetails.getName());
        student.setNim(studentDetails.getNim());
        student.setEmail(studentDetails.getEmail());
        student.setAddress(studentDetails.getAddress());
        return studentRepository.save(student);
    }

    public void delete(Long id) {
        studentRepository.deleteById(id);
    }


    // Custom query: Find students by NIM
    public List<Student> findStudentsByNim(String nim) {
        return studentRepository.findStudentsByNim(nim).
                stream()
                .collect(Collectors.toList());
    }

    // Custom query: Find students by address
    public List<Student> findStudentsByAddress(String address) {
        return studentRepository.findStudentsByAddress(address).stream()
                .collect(Collectors.toList());
    }
}