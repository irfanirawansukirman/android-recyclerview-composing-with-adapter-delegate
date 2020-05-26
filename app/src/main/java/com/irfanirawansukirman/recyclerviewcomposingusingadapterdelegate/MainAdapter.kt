package com.irfanirawansukirman.recyclerviewcomposingusingadapterdelegate

import android.view.LayoutInflater
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter
import com.irfanirawansukirman.recyclerviewcomposingusingadapterdelegate.adapterdelegate.BodyDelegate
import com.irfanirawansukirman.recyclerviewcomposingusingadapterdelegate.adapterdelegate.FooterDelegate
import com.irfanirawansukirman.recyclerviewcomposingusingadapterdelegate.adapterdelegate.HeaderDelegate
import com.irfanirawansukirman.recyclerviewcomposingusingadapterdelegate.model.DisplayableItem

class MainAdapter(private val layoutInflater: LayoutInflater) :
    ListDelegationAdapter<List<DisplayableItem>>(
        HeaderDelegate(layoutInflater),
        BodyDelegate(layoutInflater),
        FooterDelegate(layoutInflater)
    )