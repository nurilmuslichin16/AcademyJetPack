package com.example.academyjetpack.ui.academy

import androidx.lifecycle.ViewModel
import com.example.academyjetpack.data.CourseEntity
import com.example.academyjetpack.data.source.AcademyRepository
import com.example.academyjetpack.utils.DataDummy

class AcademyViewModel(private val academyRepository: AcademyRepository): ViewModel() {

    fun getCourses(): List<CourseEntity> = academyRepository.getAllCourses()

}