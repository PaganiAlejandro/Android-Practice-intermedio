package com.alepagani.horoscapp.ui.detail

import com.alepagani.horoscapp.domain.model.HoroscopeModel

sealed class HoroscopeDetailState() {
    data object Loading: HoroscopeDetailState()  //Es data object porque NO recibe parametros
    data class Error(val error: String): HoroscopeDetailState()  //Es un data class porque recibe parametros
    data class Success(val data: String, val sign: String, val horoscopeModel: HoroscopeModel): HoroscopeDetailState()
}