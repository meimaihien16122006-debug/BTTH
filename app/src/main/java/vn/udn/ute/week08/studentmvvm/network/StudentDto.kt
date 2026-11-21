package com.ute.studentmvvm.network

import com.ute.studentmvvm.model.Student

data class StudentDto(
    val id: Int,
    val name: String,
    val email: String
)

fun StudentDto.toEntity(): Student {
    return Student(
        id = 0,
        fullName = name,
        studentCode = "201100${id.toString().padStart(2, '0')}",
        email = email.lowercase(),
        gpa = 3.50,
        major = "Công Nghệ Thông Tin"
    )
}