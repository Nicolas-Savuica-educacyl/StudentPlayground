package edu.iesam.studentplayground.features.students.domain

class DeleteStudentUseCase (val studentRepository: StudentRepository)  {

    operator fun invoke(id: String){
        studentRepository.delete(id)
    }
}