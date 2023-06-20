package com.example.demo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.example.demo.databinding.Fragment1Binding


class Fragment1 : Fragment() {
    private var _binding: Fragment1Binding? = null
    private val tasarim get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = Fragment1Binding.inflate(inflater, container, false)


        return tasarim.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageList = ArrayList<SlideModel>()
        imageList.add(
            SlideModel(
                "https://www.bilimkurgukulubu.com/wp-content/uploads/2018/10/kucuk-prens.jpg",
                "Küçük Prens"
            )
        )
        imageList.add(
            SlideModel(
                "https://p4.wallpaperbetter.com/wallpaper/741/169/166/snow-white-and-the-seven-dwarfs-dancing-with-prince-charming-desktop-hd-wallpaper-for-pc-tablet-and-mobile-1920%C3%971200-wallpaper-preview.jpg","Pamuk Prenses"
            )
        )
        imageList.add(
            SlideModel(
                "https://image.tmdb.org/t/p/original/goDoyVnEfu4aa7GiGRSXnO9tNIP.jpg",
                "Güzel ve çirkin"
            )
        )
        imageList.add(
            SlideModel(
                "https://www.acepfikir.com/wp-content/uploads/2019/05/9786056893131-1.jpg",
                "Kırmızı Başlıklı kız ve Vejetaryen Kurt"
            )
        )
        val imageSlider = view.findViewById<ImageSlider>(R.id.imageSliderr)
        imageSlider.setImageList(imageList)
    }


}