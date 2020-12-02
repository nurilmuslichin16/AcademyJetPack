package com.example.academyjetpack.ui.bookmark

import androidx.lifecycle.ViewModel
import com.example.academyjetpack.data.CourseEntity
import com.example.academyjetpack.utils.DataDummy

class BookmarkViewModel: ViewModel() {

    fun getBookmark(): List<CourseEntity> = DataDummy.generateDummyCourses()

}