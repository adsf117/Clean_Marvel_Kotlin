package com.puzzlebench.cmk.domain.service

import com.puzzlebench.cmk.domain.model.MarvelCard
import io.reactivex.Single

interface CharacterServices {
    fun getCharacters(): Single<List<MarvelCard>>
}