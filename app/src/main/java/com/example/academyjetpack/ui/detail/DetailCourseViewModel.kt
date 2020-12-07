package com.example.academyjetpack.ui.detail

import androidx.lifecycle.ViewModel
import com.example.academyjetpack.data.CourseEntity
import com.example.academyjetpack.data.ModuleEntity
import com.example.academyjetpack.data.source.AcademyRepository
import com.example.academyjetpack.utils.DataDummy

class DetailCourseViewModel(private val academyRepository: AcademyRepository): ViewModel() {

    private lateinit var courseId: String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun getCourse(): CourseEntity = academyRepository.getCourseWithModules(courseId)

    fun getModules(): List<ModuleEntity> = academyRepository.getAllModulesByCourse(courseId)

}