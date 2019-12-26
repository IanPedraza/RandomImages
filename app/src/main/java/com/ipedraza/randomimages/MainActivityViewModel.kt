package com.ipedraza.randomimages

class MainActivityViewModel {

    private var urlImage: String? = null

    fun callUrlImage(): String? {
        if(urlImage == null){
            urlImage = randomNombersUrl()
        }

        return urlImage
    }

    fun randomNombersUrl(): String{
        return "https://picsum.photos/${(3..5).random()}00/${(3..5).random()}00"
    }
}