package dev.bulean.itemrecycler.model

import dev.bulean.itemrecycler.R

class Datasource {
    fun loadData(): List<DataItem>{
        return listOf<DataItem>(
            DataItem(R.string.item0),
            DataItem(R.string.item1),
            DataItem(R.string.item2),
            DataItem(R.string.item3),
            DataItem(R.string.item4),
            DataItem(R.string.item5),
            DataItem(R.string.item6),
            DataItem(R.string.item7),
            DataItem(R.string.item8),
            DataItem(R.string.item9),
            DataItem(R.string.item10)
        )
    }
}