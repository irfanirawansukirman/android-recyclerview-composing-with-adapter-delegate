package com.irfanirawansukirman.recyclerviewcomposingusingadapterdelegate.adapterdelegate

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hannesdorfmann.adapterdelegates4.AdapterDelegate
import com.irfanirawansukirman.recyclerviewcomposingusingadapterdelegate.R
import com.irfanirawansukirman.recyclerviewcomposingusingadapterdelegate.model.DisplayableItem
import com.irfanirawansukirman.recyclerviewcomposingusingadapterdelegate.model.Header


class HeaderDelegate(private val layoutInflater: LayoutInflater) : AdapterDelegate<List<DisplayableItem>>() {

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return HeaderViewHolder(layoutInflater.inflate(R.layout.item_header, parent, false))
    }

    override fun isForViewType(items: List<DisplayableItem>, position: Int): Boolean {
        return items[position] is Header
    }

    override fun onBindViewHolder(
        items: List<DisplayableItem>,
        position: Int,
        holder: RecyclerView.ViewHolder,
        payloads: MutableList<Any>
    ) {
        val headerVH = holder as HeaderViewHolder
        headerVH.bindItem()
    }

    class HeaderViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindItem() {}
    }

}