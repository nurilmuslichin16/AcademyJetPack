package com.example.academyjetpack.ui.academy

import androidx.lifecycle.ViewModel
import com.example.academyjetpack.data.CourseEntity
import com.example.academyjetpack.utils.DataDummy

class AcademyViewModel: ViewModel() {

    fun getCourses(): List<CourseEntity> = DataDummy.generateDummyCourses()

}