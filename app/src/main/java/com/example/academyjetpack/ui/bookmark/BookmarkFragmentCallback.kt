package com.example.academyjetpack.ui.bookmark

import com.example.academyjetpack.data.source.local.entity.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}
