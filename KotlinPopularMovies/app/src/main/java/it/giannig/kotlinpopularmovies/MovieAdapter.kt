package it.giannig.kotlinpopularmovies

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import it.giannig.kotlinpopularmovies.R.id.element_text

/**
 * Created by giannig on 20/11/17.
 */

class MovieAdapter() : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    private lateinit var items: Array<String>
    private lateinit var ctx: Context

    constructor(items: Array, ctx: Context) : this() {
        this.items = items
        this.ctx = ctx
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {

    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view: LayoutInflater) : RecyclerView.ViewHolder(view) {

        fun bindForecast(forecast: String) {
            element_text.setText(forecast)
        }
    }
}
