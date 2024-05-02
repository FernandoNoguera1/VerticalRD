package com.example.musica.data

import com.example.musica.model.Album

class DataSource {
    fun getAlbmes(): MutableList<Album>{
        var  albumes:MutableList<Album> = mutableListOf()
        albumes.add(Album("MERCEDES","1999","https://static.krafthand.de/uploads/2023/03/07_2023_029_1a-1140x600.jpg"))

       /* albumes.add(Album("MERCEDES","1999","https://static.krafthand.de/uploads/2023/03/07_2023_029_1a-1140x600.jpg"))
        albumes.add(Album("MERCEDES","1999","https://static.krafthand.de/uploads/2023/03/07_2023_029_1a-1140x600.jpg"))
        albumes.add(Album("MERCEDES","1999","https://static.krafthand.de/uploads/2023/03/07_2023_029_1a-1140x600.jpg"))
        albumes.add(Album("MERCEDES","1999","https://static.krafthand.de/uploads/2023/03/07_2023_029_1a-1140x600.jpg"))
        albumes.add(Album("MERCEDES","1999","https://static.krafthand.de/uploads/2023/03/07_2023_029_1a-1140x600.jpg"))*/
        return albumes
    }
}