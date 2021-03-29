package com.junadhi.recyclerviewexample

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(inflater: LayoutInflater, parent: ViewGroup):
        RecyclerView.ViewHolder(inflater.inflate(R.layout.item_row_hero, parent, false)) {

    private var imgView: ImageView? = null
    private var txtTitle: TextView? = null
    private var txtDesc: TextView? = null

    init {
        imgView = itemView.findViewById(R.id.img_item_photo)
        txtTitle = itemView.findViewById(R.id.tv_item_name)
        txtDesc = itemView.findViewById(R.id.tv_item_description)
    }

    fun bind(data: Hero){
        imgView?.setImageResource(data.imgView)
        txtTitle?.text = data.txtTitle
        txtDesc?.text = data.txtDesc

    }
}