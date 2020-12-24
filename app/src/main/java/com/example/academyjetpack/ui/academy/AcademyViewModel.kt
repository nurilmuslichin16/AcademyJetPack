package com.example.academyjetpack.ui.academy

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.academyjetpack.vo.Resource
import com.example.academyjetpack.data.source.local.entity.CourseEntity
import com.example.academyjetpack.data.source.AcademyRepository

class AcademyViewModel(private val academyRepository: AcademyRepository): ViewModel() {

    fun getCourses(): LiveData<Resource<List<CourseEntity>>> = academyRepository.getAllCourses()

}