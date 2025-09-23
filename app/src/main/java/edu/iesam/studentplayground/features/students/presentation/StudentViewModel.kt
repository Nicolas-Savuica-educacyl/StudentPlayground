package edu.iesam.studentplayground.features.students.presentation

import androidx.lifecycle.ViewModel
import edu.iesam.studentplayground.features.students.domain.DeleteStudentUseCase
import edu.iesam.studentplayground.features.students.domain.GetAllStudentsUseCase
import edu.iesam.studentplayground.features.students.domain.SaveStudentUseCase
import edu.iesam.studentplayground.features.students.domain.Student
import edu.iesam.studentplayground.features.students.domain.UpdateStudentUseCase

class StudentViewModel(
    private val saveStudentUseCase: SaveStudentUseCase,
    private val deleteStudentUseCase: DeleteStudentUseCase,
    private val getAllStudentsUseCase: GetAllStudentsUseCase,
    private val updateStudentUseCase: UpdateStudentUseCase
) : ViewModel() {

    fun saveClicked(exp: String, name: String) {
        saveStudentUseCase.invoke(Student(exp, name))
    }

    fun delete(id: String) {
        deleteStudentUseCase.invoke(id)
    }

    fun viewStudents(): List<Student> {
        return getAllStudentsUseCase.invoke()
    }

    fun update(exp: String, name: String) {
        updateStudentUseCase.invoke(Student(exp, name))
    }


}