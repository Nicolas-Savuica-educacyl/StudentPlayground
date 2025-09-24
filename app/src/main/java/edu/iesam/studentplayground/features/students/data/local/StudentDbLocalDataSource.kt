package edu.iesam.studentplayground.features.students.data.local

import edu.iesam.studentplayground.features.students.domain.Student

class StudentDbLocalDataSource  {

    private val dataSource : MutableMap<String, Student> = mutableMapOf()

    fun save(student: Student) {
        dataSource.put(student.exp, student)
    }


     fun getAll() {
        TODO("Not yet implemented")
    }

     fun update(student: Student) {
        TODO("Not yet implemented")
    }

     fun delete(id: String) {
        TODO("Not yet implemented")
    }
}