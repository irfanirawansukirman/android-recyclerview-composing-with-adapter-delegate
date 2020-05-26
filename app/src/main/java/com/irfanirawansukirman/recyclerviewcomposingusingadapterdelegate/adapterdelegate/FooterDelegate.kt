package com.irfanirawansukirman.recyclerviewcomposingusingadapterdelegate.adapterdelegate

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hannesdorfmann.adapterdelegates4.AdapterDelegate
import com.irfanirawansukirman.recyclerviewcomposingusingadapterdelegate.R
import com.irfanirawansukirman.recyclerviewcomposingusingadapterdelegate.model.DisplayableItem
import com.irfanirawansukirman.recyclerviewcomposingusingadapterdelegate.model.Footer

class FooterDelegate(private val layoutInflater: LayoutInflater) : AdapterDelegate<List<DisplayableItem>>() {

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return FooterViewHolder(layoutInflater.inflate(R.layout.item_footer, parent, false))
    }

    override fun isForViewType(items: List<DisplayableItem>, position: Int): Boolean {
        return items[position] is Footer
    }

    override fun onBindViewHolder(
        items: List<DisplayableItem>,
        position: Int,
        holder: RecyclerView.ViewHolder,
        payloads: MutableList<Any>
    ) {
        val footerVH = holder as FooterViewHolder
        footerVH.bindItem()
    }

    class FooterViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindItem() {}
    }
}