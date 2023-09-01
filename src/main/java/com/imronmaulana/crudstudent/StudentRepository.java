package com.imronmaulana.crudstudent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    // Native SQL query to retrieve all students
    @Query(value = "SELECT * FROM students", nativeQuery = true)
    List<Student> getAllStudents();

    // Native SQL query to retrieve students by their NIM
    @Query(value = "SELECT * FROM students WHERE nim = ?1", nativeQuery = true)
    List<Student> findStudentsByNim(String nim);

    // Native SQL query to retrieve students by their address
    @Query(value = "SELECT * FROM students WHERE address LIKE %?1%", nativeQuery = true)
    List<Student> findStudentsByAddress(String address);
}

