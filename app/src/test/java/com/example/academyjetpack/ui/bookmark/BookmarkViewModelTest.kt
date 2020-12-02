package com.example.academyjetpack.ui.bookmark

import junit.framework.TestCase
import org.junit.Before
import org.junit.Test

class BookmarkViewModelTest : TestCase() {

    private lateinit var viewModel: BookmarkViewModel

    @Before
    override fun setUp() {
        viewModel = BookmarkViewModel()
    }

    @Test
    fun testGetBookmark() {
        val courseEntities = viewModel.getBookmark()
        assertNotNull(courseEntities)
        assertEquals(5, courseEntities.size)
    }
}