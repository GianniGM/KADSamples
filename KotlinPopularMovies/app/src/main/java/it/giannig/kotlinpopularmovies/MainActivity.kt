package it.giannig.kotlinpopularmovies

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mockedData = Array(5, { i -> (i * i).toString() })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hello_text_view.text = "ciao belli";

        val layoutManager = GridLayoutManager(this, calculateColumns(this))
        main_recycler_view.layoutManager = layoutManager
        main_recycler_view.adapter = MovieAdapter(mockedData, this)
    }

    private fun calculateColumns(context: Context): Int {
        val displayMetrics = context.resources.displayMetrics
        val dpWidth = displayMetrics.widthPixels / displayMetrics.density
        val nColumns = (dpWidth / 180).toInt()

        Log.d("MAIN_ACTIVITY", nColumns.toString())

        return nColumns
    }

}