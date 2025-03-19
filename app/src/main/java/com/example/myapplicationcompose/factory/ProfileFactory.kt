package com.example.myapplicationcompose.factory

import com.example.myapplicationcompose.R
import com.example.myapplicationcompose.model.Profile

object ProfileFactory {
    fun getProfileData() = Profile(
        isAdmin = true,
        firstName = "Dheeraj Singh",
        lastName = "Chauhan",
        email = "dh123@gmail.com",
        telephone = "+917509854751",
        gender = " Male ",
        avatarUrl = R.drawable.news_icon,
        customerNo = 12345678
    )
}