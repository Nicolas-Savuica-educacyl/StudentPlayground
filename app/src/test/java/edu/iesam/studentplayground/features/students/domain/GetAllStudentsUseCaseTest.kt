package edu.iesam.studentplayground.features.students.domain

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import junit.framework.TestCase.assertEquals
import org.junit.Test

class GetAllStudentsUseCaseTest {

    /**
     * When ---- Then ----
     */

    @Test
    fun `when invoke then show all students` (){
        // Given
        val studentRepositoryMock = mockk<StudentRepository>()
        val expectedStudents = listOf(
            Student("0001", "Nico"),
            Student("0002", "Mihai")
        )
        every { studentRepositoryMock.getAll() } returns expectedStudents

        val getAllStudentUseCase = GetAllStudentsUseCase(studentRepositoryMock)

        // When
        val result = getAllStudentUseCase.invoke()

        // Then
        verify(exactly = 1) { studentRepositoryMock.getAll() }
        assertEquals(expectedStudents, result)
    }

}