package com.puzzlebench.cmk.data.mocks.factory

import com.puzzlebench.cmk.domain.model.MarvelCard
import com.puzzlebench.cmk.domain.model.Thumbnail


class CharactersFactory {

    companion object Factory {
        const val BASE_NAME = "Name"
        const val BASE_DESCRIPTION = "Description"
        const val BASE_PATH = "image"
        const val BASE_EXTENSION = ".png"

        fun getMockListCharacter(): List<MarvelCard> = listOf(1..5).map {
            MarvelCard("${BASE_NAME}$it", "${BASE_DESCRIPTION}$it", Thumbnail("${BASE_PATH}$it", BASE_EXTENSION))
        }

        fun getMockCharacter(): MarvelCard {
            return MarvelCard(BASE_NAME, BASE_DESCRIPTION, Thumbnail(BASE_PATH, BASE_EXTENSION))
        }


    }
}
