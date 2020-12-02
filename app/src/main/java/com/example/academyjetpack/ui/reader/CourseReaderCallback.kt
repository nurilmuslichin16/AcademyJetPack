package com.example.academyjetpack.ui.reader

interface CourseReaderCallback {
    fun moveTo(position: Int, moduleId: String)
}