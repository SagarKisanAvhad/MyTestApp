package com.example.mytestapp.utils

object FirstNameExtractor {
    fun extractFirstName(fullName: String?): String? {

        if (fullName.isNullOrEmpty())
            return ""
        return fullName.trim().split(" ")[0]
    }
}