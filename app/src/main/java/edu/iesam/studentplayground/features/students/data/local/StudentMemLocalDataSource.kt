package edu.iesam.studentplayground.features.students.data.local

import edu.iesam.studentplayground.features.students.domain.Student
class StudentMemLocalDataSource {

    private val dataSource : MutableMap<String, Student> = mutableMapOf()

     fun save(student: Student) {
        dataSource.put(student.exp, student)
    }

    fun getAll(): List<Student> {
        return dataSource.values.toList()
    }

    fun update(student: Student) {
        dataSource.replace(student.exp, student)
    }

    fun delete(id: String) {
        dataSource.remove(id)
    }
}