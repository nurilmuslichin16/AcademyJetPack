package com.example.academyjetpack.ui.bookmark

import androidx.lifecycle.ViewModel
import com.example.academyjetpack.data.CourseEntity
import com.example.academyjetpack.data.source.AcademyRepository
import com.example.academyjetpack.utils.DataDummy

class BookmarkViewModel(private val academyRepository: AcademyRepository): ViewModel() {

    fun getBookmark(): List<CourseEntity> = academyRepository.getBookmarkedCourses()

}