package com.example.mytestapp.utils

import org.junit.Assert.*
import org.junit.Test

class FirstNameExtractorTest {

    companion object {
        const val FIRST_NAME = "Sagar"
    }

    @Test
    fun extractFirstName_NullInput_ReturnEmptyString() {
        assertEquals("", FirstNameExtractor.extractFirstName(null))

    }

    @Test
    fun extractFirstName_EmptyStringInput_ReturnEmptyString() {
        assertEquals("", FirstNameExtractor.extractFirstName(""))

    }

    @Test
    fun extractFirstName_FullName_ReturnsCorrect() {
        assertEquals(FIRST_NAME, FirstNameExtractor.extractFirstName("Sagar Avhad"))

    }

    @Test
    fun extractFirstName_FullNameStartsWithWhiteSpace_ReturnsCorrect() {
        assertEquals(FIRST_NAME, FirstNameExtractor.extractFirstName("  Sagar Avhad"))

    }

    @Test
    fun extractFirstName_FullNameWithTrailingWhiteSpace_ReturnsCorrect() {
        assertEquals(FIRST_NAME, FirstNameExtractor.extractFirstName("Sagar Avhad  "))

    }

    @Test
    fun extractFirstName_FullNameWithWhiteSpacesAound_ReturnsCorrect() {
        assertEquals(FIRST_NAME, FirstNameExtractor.extractFirstName("  Sagar Avhad  "))

    }

}