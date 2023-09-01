package com.imronmaulana.crudstudent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Create a new student
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    // Retrieve all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Retrieve a student by ID
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    // Update a student's information
    public Student updateStudent(Long id, Student updatedStudent) {
        Optional<Student> existingStudent = studentRepository.findById(id);

        if (existingStudent.isPresent()) {
            Student studentToUpdate = existingStudent.get();
            studentToUpdate.setName(updatedStudent.getName());
            studentToUpdate.setNim(updatedStudent.getNim());
            studentToUpdate.setEmail(updatedStudent.getEmail());
            studentToUpdate.setAddress(updatedStudent.getAddress());

            return studentRepository.save(studentToUpdate);
        } else {
            throw new IllegalArgumentException("Student with ID " + id + " not found");
        }
    }

    // Delete a student by ID
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    // Custom query: Find students by NIM
    public List<Student> findStudentsByNim(String nim) {
        return studentRepository.findStudentsByNim(nim);
    }

    // Custom query: Find students by address
    public List<Student> findStudentsByAddress(String address) {
        return studentRepository.findStudentsByAddress(address);
    }
}