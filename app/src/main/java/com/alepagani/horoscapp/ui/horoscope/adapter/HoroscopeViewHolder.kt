package com.alepagani.horoscapp.ui.horoscope.adapter

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.alepagani.horoscapp.databinding.ItemHoroscopeBinding
import com.alepagani.horoscapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)
    fun render(horoscope: HoroscopeInfo, onIemSelected: (HoroscopeInfo) -> Unit) {
        val context = binding.itemTextHoroscope.context
        binding.itemImgHoroscope.setImageResource(horoscope.img)
        binding.itemTextHoroscope.text = context.getString(horoscope.name)

        binding.parent.setOnClickListener {
            startRotationAnimation(binding.itemImgHoroscope, newLambda = {onIemSelected(horoscope)})
            //onIemSelected(horoscope)
        }
    }

    private fun startRotationAnimation(view:View, newLambda: () -> Unit){
        view.animate().apply {
            duration = 500
            interpolator = LinearInterpolator()
            rotationBy(360f)
            withEndAction(newLambda)
            start()
        }
    }
}