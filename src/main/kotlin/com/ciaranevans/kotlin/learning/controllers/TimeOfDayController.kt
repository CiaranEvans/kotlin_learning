package com.ciaranevans.kotlin.learning.controllers

import com.ciaranevans.kotlin.learning.models.TimeOfDayValues
import org.springframework.web.bind.annotation.RestController
import com.ciaranevans.kotlin.learning.services.TimeOfDayService
import org.springframework.web.bind.annotation.GetMapping

@RestController
class TimeOfDayController(private val timeOfDayService: TimeOfDayService) {

    @GetMapping("/timeOfDay")
    fun getTimeOFDayFromService(): TimeOfDayValues {
        val timeOfDay = timeOfDayService.getTimeOfDay()
        return TimeOfDayValues(timeOfDay.dayOfMonth,
                timeOfDay.monthValue,
                timeOfDay.year,
                timeOfDay.hour,
                timeOfDay.minute)
    }

}