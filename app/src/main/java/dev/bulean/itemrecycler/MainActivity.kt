package dev.bulean.itemrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import dev.bulean.itemrecycler.model.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataset = Datasource().loadData()
        val recycler = findViewById<RecyclerView>(R.id.recycler)
        recycler.adapter = ItemAdapter(dataset)
        recycler.setHasFixedSize(true)
    }
}