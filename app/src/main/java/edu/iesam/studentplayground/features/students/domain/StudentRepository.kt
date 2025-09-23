package edu.iesam.studentplayground.features.students.domain

interface StudentRepository {

    fun save(student: Student)
    fun create(student: Student)
    fun getAll()
    fun update(student: Student)
    fun delete(id: String)
}