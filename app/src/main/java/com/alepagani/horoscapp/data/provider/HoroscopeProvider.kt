package com.alepagani.horoscapp.data.provider

import com.alepagani.horoscapp.domain.model.HoroscopeInfo
import com.alepagani.horoscapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {
    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Tauro,
            Picis,
            Capricornio,
            Geminis,
            Acuario,
            Cancer,
            Escorpio,
            Sagitario,
            Virgo,
            Leo,
            Libra
        )
    }
}