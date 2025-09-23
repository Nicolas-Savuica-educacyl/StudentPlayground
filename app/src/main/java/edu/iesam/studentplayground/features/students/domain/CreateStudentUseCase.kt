package edu.iesam.studentplayground.features.students.domain

class CreateStudentUseCase(val studentRepository: StudentRepository)  {

    operator fun invoke(student: Student){
        studentRepository.create(student)
    }
}