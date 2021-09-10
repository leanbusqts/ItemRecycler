package dev.bulean.itemrecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.bulean.itemrecycler.model.DataItem

class ItemAdapter(private val dataset: List<DataItem>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemData = dataset[position]
        holder.bind(itemData)
    }

    override fun getItemCount(): Int = dataset.size

    class ViewHolder private constructor(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val textView: TextView = itemView.findViewById(R.id.item_title)

        fun bind(dataItem: DataItem){
            val res = itemView.context.resources
            textView.text = res.getString(dataItem.item)
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = layoutInflater.inflate(R.layout.data_item, parent, false)
                return ViewHolder(view)
            }
        }
    }
}