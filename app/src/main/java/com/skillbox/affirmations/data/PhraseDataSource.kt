package com.skillbox.affirmations.data

import com.skillbox.affirmations.R
import com.skillbox.affirmations.model.Affirmation

class PhraseDataSource {

    fun loadAffirmation(): List<Affirmation>{
        return listOf(
            Affirmation(R.string.phrase1,R.drawable.affirm),
            Affirmation(R.string.phrase2,R.drawable.affirm),
            Affirmation(R.string.phrase3,R.drawable.affirm),
            Affirmation(R.string.phrase4,R.drawable.affirm),
            Affirmation(R.string.phrase5,R.drawable.affirm),
            Affirmation(R.string.phrase6,R.drawable.affirm),
            Affirmation(R.string.phrase7,R.drawable.affirm),
            Affirmation(R.string.phrase8,R.drawable.affirm),
            Affirmation(R.string.phrase9,R.drawable.affirm),
            Affirmation(R.string.phrase10,R.drawable.affirm)
        )
    }
}