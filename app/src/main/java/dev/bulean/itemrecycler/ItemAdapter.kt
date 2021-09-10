package dev.bulean.itemrecycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.bulean.itemrecycler.model.DataItem

class ItemAdapter(private val context: Context, private val dataset: List<DataItem>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>(){

    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val view = layoutInflater.inflate(R.layout.data_item, parent, false) as TextView
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemData = dataset[position]
        holder.textView.text = context.resources.getString(itemData.item)
    }

    override fun getItemCount(): Int = dataset.size
}