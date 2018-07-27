package com.ciaranevans.kotlin.learning.services

import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class TimeOfDayService {
    fun getTimeOfDay() = LocalDateTime.now()
}