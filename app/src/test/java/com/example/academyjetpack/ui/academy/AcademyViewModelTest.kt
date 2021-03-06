package com.example.academyjetpack.ui.academy

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.academyjetpack.data.source.local.entity.CourseEntity
import com.example.academyjetpack.data.source.AcademyRepository
import com.example.academyjetpack.utils.DataDummy
import com.example.academyjetpack.vo.Resource
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class AcademyViewModelTest {

    private lateinit var viewModel: AcademyViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var academyRepository: AcademyRepository

    @Mock
    private lateinit var obeserver: Observer<Resource<List<CourseEntity>>>

    @Before
    fun setUp() {
        viewModel = AcademyViewModel(academyRepository)
    }

    @Test
    fun testGetCourses() {
        val dummyCourses = Resource.success(DataDummy.generateDummyCourses())
        val courses = MutableLiveData<Resource<List<CourseEntity>>>()
        courses.value = dummyCourses

        `when`(academyRepository.getAllCourses()).thenReturn(courses)
        val courseEntity = viewModel.getCourses().value?.data
        verify<AcademyRepository>(academyRepository).getAllCourses()
        assertNotNull(courseEntity)
        assertEquals(5, courseEntity?.size)

        viewModel.getCourses().observeForever(obeserver)
        verify(obeserver).onChanged(dummyCourses)
    }
}