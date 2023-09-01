#Student Management System
Welcome to the Student Management System project! This project is designed to help you manage student records easily using a Spring Boot application connected to a PostgreSQL database.

Table of Contents
Project Overview
Features
Prerequisites
Installation
Usage
Endpoints
Custom Queries
Contributing
License

Project Overview
The Student Management System is a Spring Boot application that allows you to perform CRUD (Create, Read, Update, Delete) operations on student records. It includes features like adding new students, retrieving student information, updating student details, and deleting student records.

Features
Create new student records
Retrieve all students
Retrieve student by ID
Update student information
Delete student records
Custom queries for searching students by NIM and address
Prerequisites
Before getting started, ensure you have the following:

Java JDK (version 17)
Spring Boot (version 3.1.3)
PostgreSQL database
Postman (for testing endpoints)

Endpoints
GET /students: Retrieve all students
GET /students/{id}: Retrieve student by ID
POST /students: Create a new student
PUT /students/{id}: Update student information by ID
DELETE /students/{id}: Delete student by ID
Custom Queries
GET /students/byNim/{nim}: Retrieve students by NIM
GET /students/byAddress/{address}: Retrieve students by address
Contributing
Contributions are welcome! If you find a bug or have a feature request, please open an issue. If you'd like to contribute code, please fork the repository and create a pull request.
