package com.example.academyjetpack.ui.academy

import junit.framework.TestCase
import org.junit.Before
import org.junit.Test

class AcademyViewModelTest : TestCase() {

    private lateinit var viewModel: AcademyViewModel

    @Before
    override fun setUp() {
        viewModel = AcademyViewModel()
    }

    @Test
    fun testGetCourses() {
        val courseEntity = viewModel.getCourses()
        assertNotNull(courseEntity)
        assertEquals(5, courseEntity.size)
    }
}