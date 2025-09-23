package edu.iesam.studentplayground.features.students.domain

class GetAllStudentsUseCase  (val studentRepository: StudentRepository) {

    operator fun invoke(){
        studentRepository.getAll()
    }
}