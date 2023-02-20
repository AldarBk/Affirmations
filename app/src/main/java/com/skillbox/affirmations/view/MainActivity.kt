package com.skillbox.affirmations.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.skillbox.affirmations.R
import com.skillbox.affirmations.data.PhraseDataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val phrasesDataSet = PhraseDataSource().loadAffirmation()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_affirmations)
        recyclerView.adapter = AffirmationsAdapter(this,phrasesDataSet)
    }
}