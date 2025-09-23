package edu.iesam.studentplayground.features.students.data.local

import edu.iesam.studentplayground.features.students.domain.Student
import edu.iesam.studentplayground.features.students.domain.StudentRepository

class StudentMemLocalDataSource {

    private val dataSource : MutableMap<String, Student> = mutableMapOf()

     fun save(student: Student) {
        dataSource.put(student.exp, student)
    }

    fun create(student: Student): Boolean {
        return if (!dataSource.containsKey(student.exp)) {
            dataSource[student.exp] = student
            true
        } else {
            false
        }
    }

    fun getAll(): List<Student> {
        return dataSource.values.toList()
    }

    fun update(student: Student): Boolean {
        return if (dataSource.containsKey(student.exp)) {
            dataSource[student.exp] = student
            true
        } else {
            false
        }
    }

    fun delete(id: String): Boolean {
        return dataSource.remove(id) != null
    }
}