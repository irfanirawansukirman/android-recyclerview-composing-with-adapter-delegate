package com.irfanirawansukirman.recyclerviewcomposingusingadapterdelegate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.irfanirawansukirman.recyclerviewcomposingusingadapterdelegate.model.Body
import com.irfanirawansukirman.recyclerviewcomposingusingadapterdelegate.model.DisplayableItem
import com.irfanirawansukirman.recyclerviewcomposingusingadapterdelegate.model.Footer
import com.irfanirawansukirman.recyclerviewcomposingusingadapterdelegate.model.Header
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainAdapter = MainAdapter(layoutInflater)
        mainAdapter.items = getListFactory()
        recyclerMain.apply {
            setHasFixedSize(true)
            adapter = mainAdapter
        }
    }

    private fun getListFactory() = mutableListOf<DisplayableItem>().apply {
        add(Header("Ini header"))
        add(Body("Ini body"))
        add(Body("Ini body"))
        add(Body("Ini body"))
        add(Body("Ini body"))
        add(Body("Ini body"))
        add(Body("Ini body"))
        add(Body("Ini body"))
        add(Body("Ini body"))
        add(Body("Ini body"))
        add(Body("Ini body"))
        add(Body("Ini body"))
        add(Body("Ini body"))
        add(Body("Ini body"))
        add(Footer("Ini footer"))
    }
}
