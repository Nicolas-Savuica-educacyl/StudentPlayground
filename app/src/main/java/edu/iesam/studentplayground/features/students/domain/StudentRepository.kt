package edu.iesam.studentplayground.features.students.domain

interface StudentRepository {

    fun save(student: Student)
    fun getAll(): List<Student>
    fun update(student: Student)
    fun delete(id: String)
}