package com.irfanirawansukirman.recyclerviewcomposingusingadapterdelegate.adapterdelegate

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate
import com.irfanirawansukirman.recyclerviewcomposingusingadapterdelegate.R
import com.irfanirawansukirman.recyclerviewcomposingusingadapterdelegate.model.Body
import com.irfanirawansukirman.recyclerviewcomposingusingadapterdelegate.model.DisplayableItem

class BodyDelegate(private val layoutInflater: LayoutInflater) :
    AbsListItemAdapterDelegate<Body, DisplayableItem, BodyDelegate.BodyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup): BodyViewHolder {
        return BodyViewHolder(layoutInflater.inflate(R.layout.item_body, parent, false))
    }

    override fun isForViewType(
        item: DisplayableItem,
        items: MutableList<DisplayableItem>,
        position: Int
    ): Boolean {
        return item is Body
    }

    override fun onBindViewHolder(item: Body, holder: BodyViewHolder, payloads: MutableList<Any>) {
        holder.bindItem(item)
    }


    class BodyViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        fun bindItem(body: Body) {
            val _title: TextView = view.findViewById(R.id.title)

            _title.text = body.title
        }
    }

}