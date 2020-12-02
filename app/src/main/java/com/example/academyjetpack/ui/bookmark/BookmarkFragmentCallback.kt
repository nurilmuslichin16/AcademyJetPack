package com.example.academyjetpack.ui.bookmark

import com.example.academyjetpack.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
