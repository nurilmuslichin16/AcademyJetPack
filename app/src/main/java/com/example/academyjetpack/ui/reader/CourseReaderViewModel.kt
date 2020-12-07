package com.example.academyjetpack.ui.reader

import androidx.lifecycle.ViewModel
import com.example.academyjetpack.data.ContentEntity
import com.example.academyjetpack.data.ModuleEntity
import com.example.academyjetpack.data.source.AcademyRepository
import com.example.academyjetpack.utils.DataDummy

class CourseReaderViewModel(private val academyRepository: AcademyRepository): ViewModel() {

    private lateinit var courseId: String
    private lateinit var moduleId: String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun setSelectedModule(moduleId: String) {
        this.moduleId = moduleId
    }

    fun getModules(): List<ModuleEntity> = academyRepository.getAllModulesByCourse(courseId)

    fun getSelectedModule(): ModuleEntity = academyRepository.getContent(courseId, moduleId)

}