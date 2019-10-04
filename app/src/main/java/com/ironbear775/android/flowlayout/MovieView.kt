package com.ironbear775.android.flowlayout

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.layout_movie_view.view.*

class MovieView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {
    init {
        LayoutInflater.from(context).inflate(R.layout.layout_movie_view, this)
    }

    fun setName(name: String){
        movieNameView.text = name
    }
}