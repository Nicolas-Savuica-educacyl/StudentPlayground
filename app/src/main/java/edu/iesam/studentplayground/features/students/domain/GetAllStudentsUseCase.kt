package edu.iesam.studentplayground.features.students.domain

class GetAllStudentsUseCase  (val studentRepository: StudentRepository) {

    operator fun invoke(): List<Student> {
        return studentRepository.getAll()
    }
}