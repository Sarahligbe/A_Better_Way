package com.example.abetterway

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_launcher.*

class LauncherActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        val arrayList = ArrayList<GridModel>()

        arrayList.add(GridModel("Family", R.drawable.fam))
        arrayList.add(GridModel("Homies", R.drawable.friends))
        arrayList.add(GridModel("Co-workers", R.drawable.colleagues))
        arrayList.add(GridModel("Haters", R.drawable.enemy))

        val gridAdapter = GridAdapter(this, arrayList)

        gridItems.layoutManager = GridLayoutManager(this,2)
        gridItems.adapter = gridAdapter


    }
}